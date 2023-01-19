class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var count: Int = 0
        
        for (i in 1 until n+1){
            if(n%i==0){
                count +=1
            }
             
        }
        answer = count
        return answer
    }
}