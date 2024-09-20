package com.rockthejvm

object Basics extends App {
    val meaningOfLife: Int = 42
    val interpolatedString = s" The meaning of life is ${meaningOfLife}"
    println(interpolatedString)

    val age = 24
    println(
        if (age < 18) "You can not vote" 
        else if (age == 24) "You are 24 years old"
        else "You can vote"
    )

    def fabulousFunction(name: String): Unit = {
        println(s"Hello, ${name}")
    }
    fabulousFunction("Mammia")

    // Loops and Iterations are BIGGLY DISCOURAGED in Scala
    // Big nono => only use RECURSION
    def recursiveTest(startNum: Int, round: Int): Int = {
        println(s"Round ${round}: ${startNum}")
        if (round == 0) startNum
        else recursiveTest(startNum + 1, round - 1)

    }
    recursiveTest(0, 10)
}