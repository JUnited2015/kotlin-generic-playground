package app

import data.MyData

fun main() {
    val dataString: MyData<String, Int> = MyData("Agus", 20)
    dataString.prinData()

    val dataInt = MyData(10, "Tiyan")
    dataInt.prinData()
}