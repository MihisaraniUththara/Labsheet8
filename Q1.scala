package labsheet4

import scala.io.StdIn.readDouble

object Q1 {
  def interest(deposit: Double): Double = {
    if (deposit <= 20000) {
      val pay = deposit * 0.02
      pay
    }
    else if (deposit <= 200000) {
      val pay = deposit * 0.04
      pay
    }
    else if (deposit <= 2000000) {
      val pay = deposit * 0.035
      pay
    }
    else {
      val pay = deposit * 0.065
      pay
    }
  }

  def main(args: Array[String]): Unit = {

    println("Enter Deposite Amount: ")
    var ammount = readDouble()

    var money = interest(ammount)
    println("Actual amount of Interest : ", money)
  }


}
