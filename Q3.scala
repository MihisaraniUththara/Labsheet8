package labsheet4

object Q3 {
  def toUpper(inputText: String): String = inputText.toUpperCase()

  def toLower(inputText: String): String = inputText.toLowerCase()

  def formatNames(name: String)(Func: String => String): String = {
    Func(name)
  }


  def main(args: Array[String]): Unit = {
    val n1 = "Benny"
    val n2 = "Niroshan"
    val n3 = "Saman"
    val n4 = "Kumara"

    println(formatNames(n1)(toUpper))
    println(formatNames(n2)(str => toUpper(str.substring(0, 2)) + toLower(str.substring(2))))
    println(formatNames(n3)(toLower))
    println(formatNames(n4)(str => toUpper(str.substring(0, 1)) + toLower(str.substring(1, 5)) + str.charAt(str.length - 1).toUpper))
  }


}
