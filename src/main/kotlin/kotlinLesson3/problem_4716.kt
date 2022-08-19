package kotlinLesson3

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Enter a number of students: ")
    val student = scan.nextInt()
    print("Enter a number of an apples: ")
    val apples = scan.nextInt()
    print(student / apples)
}