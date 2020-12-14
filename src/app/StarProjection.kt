package app

/**
 * Star projection digunakan saat kita tidak butuh dengan generic parameter type nya
 * Misal ingin mengambil panjang array
 */
fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Agus", "Tiyan", "Tamvan")

    displayLength(arrayInt)
    displayLength(arrayString)
}