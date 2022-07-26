//Programmers
//없는 숫자 더하기
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < 10; i++){
            for(int n : numbers){
                if(n == i) answer += n;
            }
        }
        
        answer -= 45;
        
        
        return -answer;
    }
}