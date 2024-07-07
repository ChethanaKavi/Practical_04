import scala.io.StdIn.readInt

object NumberClassifier {

  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val userInput = readInt()
    
    userInput match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}
