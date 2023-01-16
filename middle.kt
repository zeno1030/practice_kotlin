class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        val sortedArray = array.sorted()
        val size = sortedArray.size
        print(sortedArray)
        answer = sortedArray[size/2]
        return answer
    }
}