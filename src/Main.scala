object Main extends Application {

  override def main(args:Array[String]) {

    implicit def intToRational(x: Int) = new Rational(x)

    println(new Rational(1, 3) + new Rational(2, 3))
    println(new Rational(2, 3) + 2)
    println(2 + new Rational(2, 3))

  }

}
