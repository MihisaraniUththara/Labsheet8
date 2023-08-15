package labsheet4

import scala.io.StdIn.readInt

object Q2 {

    def patternmatch(n: Int): Any = n match {
      case n if n==0 => "Zero"
      case n if n<0 => "Negative"
      case n if n%2==0 => "Even"
      case n if n%2!=0 => "Odd"
    }

    def main(args: Array[String]): Unit = {

      println("Enter a Number: ")
      val number = readInt()
      var p = patternmatch(number)
      println(p)
    }

}
