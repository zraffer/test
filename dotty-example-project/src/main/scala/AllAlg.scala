object AllAlg {
  import AllCat._

  // the typeclass of algebras of F[_]
  trait IsAlgebra[F[_], X] {
    val getOper: F[X] => X
  }
  // helpers
  type IsAlg[F[_]] = [X] =>> IsAlgebra[F, X]
  def Alg[F[_], X: IsAlg[F]]: IsAlg[F][X] = the
  def Oper[F[_]]:
    [X] => F[X] => given IsAlg[F][X] => X = 
    [X] => (fx: F[X]) => given (alg: IsAlg[F][X]) => alg.getOper(fx)

  // inductive data type
  type IsData[F[_]] = IsInit[IsAlg[F]]

  // encoding
  trait Code[F[_]] {
    def code[Y: IsAlg[F]]: Y
  }
  case class MkCode[F[_]](
      val it: [Y] => given IsAlg[F][Y] => Y)
    extends Code[F]
  { override def code[Y: IsAlg[F]]: Y = it[Y] }
  // proof
  implicit def CodeIsData[F[_]: IsFunctor]: IsData[F][Code[F]] = 
    new IsInitial[IsAlg[F], Code[F]] with IsAlgebra[F, Code[F]] {
      override def getRecur[Y: IsAlg[F]]: Code[F] => Y = _.code[Y]
      override val getOper: F[Code[F]] => Code[F] = 
        finitf => new Code[F] {
          override def code[Y: IsAlg[F]]: Y =
            Oper[F](Map[F](getRecur[Y])(finitf)) 
        }
    }
}