package functions

fun TryCatchBlock(readLine: String?): Int {
    try {
        return readLine?.toInt()!!
    }catch (e: Exception) {
        return -1
    }
}