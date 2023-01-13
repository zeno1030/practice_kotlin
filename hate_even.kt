class Solution {
    fun solution(n: Int): IntArray {
        val result = arrayListOf<Int>()
        for (i in 1 .. n) {
            if (i % 2 != 0) {
                result.add(i)
            }
        }
    
        return result.toIntArray()
    }
    }