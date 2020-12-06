package app

import data.MyData

fun main() {

    /**
     * Generic Class
     */
    val myData: MyData<String, Int> = MyData("Agus", 20)
    myData.prinData()
    myData.printSecond()
}