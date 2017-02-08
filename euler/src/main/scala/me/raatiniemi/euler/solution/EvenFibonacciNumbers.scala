package me.raatiniemi.euler.solution

import scala.math.BigInt

object EvenFibonacciNumbers {
  private val maximum = 4000000

  def apply(): Unit = {
    val sum = buildFibonacciStream()
      .takeWhile(isBelowMaximum)
      .filter(isEvenValue)
      .sum

    println(s"The sum of even fibonacci numbers below $maximum is $sum")
  }

  private def buildFibonacciStream(): Stream[BigInt] = {
    lazy val fibonacci: Stream[BigInt] = BigInt(0) #:: BigInt(1) #::
      fibonacci.zip(fibonacci.tail)
        .map { n => n._1 + n._2 }

    fibonacci
  }

  private def isBelowMaximum(value: BigInt) = {
    value < maximum
  }

  private def isEvenValue(value: BigInt) = {
    0 == value % 2
  }
}
