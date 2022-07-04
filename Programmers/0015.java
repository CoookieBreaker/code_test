//Programmers
//문자열 다루기 기본

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        
        if(s.length() == 4 || s.length() == 6){
            answer = s.matches("[+-]?\\d*(\\.\\d+)?");
        }else{
            answer = false;
        }
        
        return answer;
    }
}