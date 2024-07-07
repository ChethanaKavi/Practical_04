object NumberClassifier {
  def classifyNumber(number: Int): String = {
    number match {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as an argument.")
    } else {
      try {
        val number = args(0).toInt
        println(classifyNumber(number))
      } catch {
        case _: NumberFormatException => println("Invalid input. Please provide a valid integer.")
      }
    }
  }
}
