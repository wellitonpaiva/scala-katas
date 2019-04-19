package com.thescientist.kata

object FizzBuzz {
  def getResult(number: Int): Any = (number % 3, number % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _ => number
  }

}

