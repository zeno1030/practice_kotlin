class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = n/7
        if (n%7>0){
            answer +=1
        }
        return answer
    }
}