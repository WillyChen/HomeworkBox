package tw.com.boxkotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter box length:")
    val length = scanner.nextFloat()
    print("Please enter box width:")
    val width = scanner.nextFloat()
    print("Please enter box height:")
    val height = scanner.nextInt()

    val box3 = Box3(23f,14f,13)
    val box5 = Box5(39.5f,27.5f,23)
    if (box3.validate(length,width,height)) {
        println("Box3")
    }
    else if (box5.validate(length,width,height)) {
        println("Box5")
    }
    else {
        println("Box Out...")
    }
}