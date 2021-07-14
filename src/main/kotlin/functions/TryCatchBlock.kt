package functions


fun tryCatchBlock(readLine: String?): Int {
    try {
        return readLine?.toInt()!!
    }catch (e: Exception) {
        return -1
    }
}