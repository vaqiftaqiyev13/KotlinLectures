package kotlinLesson3

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter a number: ")

    val number = scanner.nextInt()

    println("First number: ${number/10}\nSecond number: ${number%10}")
}