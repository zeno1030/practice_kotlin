class Solution {
    fun solution(sides: IntArray): Int {
        val list = sides.toList().sortedDescending()
        print(list)
        return if(list[1]+list[2]>list[0]){
            1
        } else {
            2
        }
    }
}