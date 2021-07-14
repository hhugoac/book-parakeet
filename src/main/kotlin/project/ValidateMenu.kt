package project

fun validateMenu(): Int{
    try {
        var option = readLine()!!.toInt()
        println("Validando...")
        if ( option == 1 || option == 2 ) {
            return option
        }
        else{
            return -1
        }
    } catch (e: Exception) {
        println("Hubo un error: $e")
        return -1
    }
}