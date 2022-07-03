//Programmers
//핸드폰 번호 가리기

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int len = phone_number.length() - 4;
        
        for(int i = 0; i < len; i++){
            answer.append("*");
        }
        
        answer.append(phone_number.substring(len));
        
        return answer.toString();
    }
}