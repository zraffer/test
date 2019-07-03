object AllCoAlg {
  import AllCat._

  // the typeclass of algebras of F[_]
  trait IsCoAlgebra[F[_], X] {
    val getCoOper: X => F[X]
  }
  // helpers
  type IsCoAlg[F[_]] = [X] =>> IsCoAlgebra[F, X]
  def CoAlg[F[_], X: IsCoAlg[F]]: IsCoAlg[F][X] = the
  def CoOper[F[_]]:
    [X] => X => given IsCoAlg[F][X] => F[X] = 
    [X] => (x: X) => given (coalg: IsCoAlg[F][X]) => coalg.getCoOper(x)

  // inductive data type
  type IsCoData[F[_]] = IsTerm[IsCoAlg[F]]

  // encoding
  trait Code[F[_]] {
    type It
    val it: It
    implicit val coalg: IsCoAlg[F][It]
  }
  case class MkCode[F[_], X](
      override val it: X,
      override val coalg: IsCoAlg[F][X])
    extends Code[F] 
  { override type It = X }
  // proof
  implicit def CodeIsCoData[F[_]: IsFunctor]: IsCoData[F][Code[F]] = 
    new IsTerminal[IsCoAlg[F], Code[F]] with IsCoAlgebra[F, Code[F]] {
      override def getCoRecur[Y: IsCoAlg[F]]: Y => Code[F] = 
        (y: Y) => MkCode(y, CoAlg[F, Y])
      override val getCoOper: Code[F] => F[Code[F]] = 
        { code => import code.coalg; Map[F](getCoRecur[code.It])(CoOper[F](code.it))}
    }
}