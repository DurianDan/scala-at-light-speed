package com.rockthejvm

object ObjectOrientation extends App {
    class Animal {
        val creatureType = "Wild"
        def eat = println("nomnom")
    }

    val animal1 = new Animal

    class Wolverine(val age: Int) extends Animal {
        override val creatureType = "Angry"
        override def eat = println("crunch crunch")
    }
    val wol = Wolverine(11)
    println(wol.age)

    abstract class FlyingAnymal {
        val wings = 2;
        def fly(): Unit
    }
}