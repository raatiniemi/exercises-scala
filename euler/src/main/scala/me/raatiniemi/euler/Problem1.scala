package me.raatiniemi.euler

object Problem1 {
  private val maxLimit = 1000

  def main(args: Array[String]) {
    val sum = (1 until maxLimit)
      .filter(isMultiplesOfThreeOrFive)
      .sum

    println(s"The sum of all the multiples of 3 or 5 below $maxLimit is $sum")
  }

  private def isMultiplesOfThreeOrFive(number: Int) = {
    number % 3 == 0 || number % 5 == 0
  }
}
