package me.raatiniemi.euler

import me.raatiniemi.euler.solution.MultiplesOf3And5

object Solution {
  def main(args: Array[String]): Unit = {
    args(0) match {
      case "1" => MultiplesOf3And5()
      case _ => println("Unknown solution")
    }
  }
}
