fun thirdLargestNum(arr: IntArray): Int {
    if (arr.size < 3){
        return -1
    }
    val sortedSet = arr.toSortedSet()

    val largest = arr.maxOrNull() ?: 0

    val thirdLargest = sortedSet.elementAt(sortedSet.size - 3)

    return if (largest == thirdLargest) largest else thirdLargest
}

fun main() {
    var arr = intArrayOf(101, 150, 99, 34, 11, 12, 100)

    val aee = intArrayOf(11, 12, 34,12, 45, 3,4,15,13,67,132,12)

    println(thirdLargestNum(aee))
}