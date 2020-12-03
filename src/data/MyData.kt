package data

class MyData<T, U>(val firstData: T, val secondData: U) {

    fun prinData() {
        println("Data is $firstData")
    }

    fun printSecond() {
        println("Second Data is $secondData")
    }

    fun getData(): T = firstData

    fun getSecond(): U = secondData
}