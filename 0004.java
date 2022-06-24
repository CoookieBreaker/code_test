//programmers
//완주하지 못한 선수
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(String pa : participant){
            boolean eq = false;
            for(String co : completion){
                if(pa.equals(co)) eq = true; 
            }
            if(!eq)
            answer = pa.toString();
        }
        return answer;
    }
}