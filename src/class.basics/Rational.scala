package classbasics

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numerator = n
  val denominator = d

  // Constructor overload
  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  def +(that: Int): Rational = new Rational(numerator + that * denominator, denominator)

  override def toString = numerator + "/" + denominator
}
