class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        answer = 12000 *n + 2000*k -n/10 * 2000
        return answer
    }
}