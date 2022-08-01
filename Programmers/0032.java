//Programmers
//완주하지 못한 선수
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, String> list = new HashMap<String, String>();
        
        for(int i = 0; i < participant.length; i++){
            for(int j = 0; j < completion.length; j++){
                if(participant[i].equals(completion[j])) list.put(participant[i], completion[j]);
            }
        }
        for(int i = 0; i < participant.length; i++){
            if(list.get(participant[i]) == null) answer = participant[i];
        }
        return answer;
    }
}