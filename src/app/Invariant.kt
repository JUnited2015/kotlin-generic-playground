package app

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant("String")

    /**
     * Secara default, saat membuat generic parameter type, sifat parameter tersebut adalah invariant
     * Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
     * Artinya saat membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>, begitupun sebaliknya.
     */
//    val invariantAny: Invariant<Any> = invariantString // tidak bisa
//    invariantAny.data = 100
}