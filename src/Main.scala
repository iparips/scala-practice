import classbasics.Rational

object Main extends App {

  override def main(args:Array[String]) {

    // implicit conversions
    implicit def intToRational(x: Int) = new Rational(x)

    println(new Rational(1, 3) + new Rational(2, 3))
    println(new Rational(2, 3) + 2)
    println(2 + new Rational(2, 3))


    // passing an anonymous function as a param
    val result1 = passingfunctionsasparams.calculate(() => 1 + 2 )
    println("result of passing an inline function: " + result1)

    // passing a named function as a param
    val f = () =>  1 + 2
    val result2 = passingfunctionsasparams.calculate( f )
    println("result of passing a named fucntion: " + result2)

    // passing a function defined with a function definition as a param
    def j() = 4 + 4
    val result3 = passingfunctionsasparams.calculate( j )
    println("result of passing a function defined with a function definition: " + result3)



  }
}

