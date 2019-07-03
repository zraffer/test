object AllCat {

  // typeclass for  (endo)functor
  trait IsFunctor[F[_]] {
    def getMap[X, Y]: (X => Y) => (F[X] => F[Y])
  }
  // helpers
  def Functor[F[_]: IsFunctor]: IsFunctor[F] = the
  def Map[F[_]]: 
    [X, Y] => (X => Y) => given IsFunctor[F] => (F[X] => F[Y]) = 
    [X, Y] => (m: X => Y) => given (functor: IsFunctor[F]) => functor.getMap(m)

  // isomorphism
  trait <=>[X, Y] {
    val fw: X => Y
    val bw: Y => X
  }

  // uniqueness property
  trait IsUnique[T[_]] {
    def iso[X: T, Y: T]: X <=> Y 
  }

  // initial object property for typeclass T[_]
  trait IsInitial[T[_], X] {
    self: T[X] =>
    def getRecur[Y: T]: X => Y
  }
  // helpers
  type IsInit[T[_]] = [X] =>> IsInitial[T, X] & T[X]
  def Init[T[_], X: IsInit[T]]: IsInit[T][X] = the
  def Recur[T[_], X: IsInit[T], Y: T]: X => Y = Init[T, X].getRecur[Y]
  // initial is unique
  implicit def InitIsUniq[T[_]]: IsUnique[IsInit[T]] = 
    new IsUnique[IsInit[T]] {
      override def iso[X: IsInit[T], Y: IsInit[T]]: X <=> Y = 
        new (X <=> Y) {
          val fw: X => Y = Recur[T, X, Y]
          val bw: Y => X = Recur[T, Y, X]
        }
    }

  // terminal object property for typeclass T[_]
  trait IsTerminal[T[_], X] {
    self: T[X] =>
    def getCoRecur[Y: T]: Y => X
  }
  // helpers
  type IsTerm[T[_]] = [X] =>> IsTerminal[T, X] & T[X]
  def Term[T[_], X: IsTerm[T]]: IsTerm[T][X] = the
  def CoRecur[T[_], X: IsTerm[T], Y: T]: Y => X = Term[T, X].getCoRecur[Y]
  // proof: terminal is unique
  implicit def TermIsUniq[T[_]]: IsUnique[IsTerm[T]] = new {
    override def iso[X: IsTerm[T], Y: IsTerm[T]]: X <=> Y = new (X <=> Y) {
      val fw: X => Y = CoRecur[T, Y, X]
      val bw: Y => X = CoRecur[T, X, Y]
    }
  }
}