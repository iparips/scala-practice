
class Rational(n:Int, d:Int) {

  require (d!=0)

  val numerator = n
  val denominator = d

  def + (that:Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  override def toString = numerator + "/" + denominator
}
