//Programmers
//가운데 글자 가져오기
class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length() / 2;

        if(s.length() % 2 == 0){
            answer = s.substring(length-1, length + 1);
        }else{
            answer = s.substring(length, length+1);
        }
        
        return answer;
    }
}