
package object passingfunctionsasparams {

  def calculate(arithmeticOperation: () => Int) = arithmeticOperation()

}