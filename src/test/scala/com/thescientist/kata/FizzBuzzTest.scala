package com.thescientist.kata

import org.scalatest.{Matchers, FlatSpec}

/*
For a given natural number greater than zero return:
* "fizz" if the number is dividable by 3
* "buzz" if the number is dividable by 5
* "fizzbuzz" if the number is dividable by 15
* the same number if no other requirement is fulfilled
 */
class FizzBuzzTest extends FlatSpec with Matchers {

  "FizzBuzz" should "return fizz if the number is dividable by 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be ("fizz")
  }

  "FizzBuzz" should "return buzz if the number is dividable by 5" in {
    FizzBuzz.getResult(5) should be ("buzz")
    FizzBuzz.getResult(10) should be ("buzz")
  }

  "FizzBuzz" should "return fizzbuzz if the number is dividable by 15" in {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
    FizzBuzz.getResult(30) should be ("fizzbuzz")
  }

  "FizzBuzz" should "return the number itself any requirement is fulfilled" in {
    FizzBuzz.getResult(2) should be (2)
    FizzBuzz.getResult(7) should be (7)
  }
}
