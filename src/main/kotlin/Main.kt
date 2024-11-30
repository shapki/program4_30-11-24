/*В исходном массиве nums, для каждого nums[i] найдите, сколько чисел в массиве меньше его.
То есть, для каждого nums[i] нужно посчитать количество допустимых индексов j таких, что  j != i и nums[j] < nums[i].
Верните ответ в виде массива*/

import kotlin.system.measureTimeMillis

fun smallerNumsThanCur(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        var count = 0
        for (j in nums.indices)
            if (i != j && nums[j] < nums[i])
                count++
        result[i] = count
    }
    return result
}

fun readInt(): IntArray {
    return readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
}

fun main() {
    print("Введите массив чисел: ")
    val nums = readInt()

    testSmallerNumsThanCur(nums)
}

fun testSmallerNumsThanCur(nums: IntArray) {
    val startTime = System.currentTimeMillis()
    val result = smallerNumsThanCur(nums)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: ${result.contentToString()}, Время: $time мс")
}