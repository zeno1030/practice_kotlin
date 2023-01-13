class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        answer = n/slice
        if(n%slice>0){
            answer +=1
        }
        return answer
    }
}