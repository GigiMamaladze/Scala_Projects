import scala.io.StdIn

@main
def MathOperators: Unit = {
    val firstNumber = readInt("First number _ ")
    val secondNumber = readInt("Second number _ ")
    val variant = StdIn.readLine("Chose the operation A)Sum B)Multiply C)Divide _ ").toUpperCase()
    variant match {
      case "A" => println(s"Sum is ${sum(firstNumber, secondNumber)}")
      case "B" => println(s"Multiply is ${multiply(firstNumber, secondNumber)}")
      case "C" => println(s"Divide is ${divide(firstNumber, secondNumber)}")
      case _ => println("No variant is chose")
    }
  }

  def readInt(txt: String) = {
    print(txt)
    StdIn.readInt()
  }

  def sum(firstNum: Int, secondNum: Int) = firstNum + secondNum

  def multiply(firstNum: Int, secondNum: Int) = firstNum * secondNum

  def divide(firstNum: Double, secondNum: Double) = firstNum / secondNum