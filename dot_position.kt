class Solution {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0
        if(dot[0]>0 &&dot[1]>0){
            answer=1
        }
        else if(dot[0]<0&&dot[1]>0){
            answer=2
        }
        else if(dot[0]<0&&dot[1]<0){
            answer=3
        }
        else{
            answer =4
        }
        return answer
    }
}