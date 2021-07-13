package functions

import kotlinx.coroutines.delay

//This code uses coroutines to print a loading message
suspend fun loading() {
    println()
    print("Cargando")
    for (i in 1..50){
        print(".")
        delay(200)
    }
    println()
    println("Presione enter para continuar")
}