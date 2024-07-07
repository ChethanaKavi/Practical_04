object NameFormatter {

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1)(toUpper))      // Output: BENNY
    println(formatNames(name2)(name => name.substring(0, 2).toUpperCase + name.substring(2))) // Output: NIroshan
    println(formatNames(name3)(toLower))      // Output: saman
    println(formatNames(name4)(name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase)) // Output: KumarA
  }
}
