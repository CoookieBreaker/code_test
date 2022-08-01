//Programmers
//완주하지 못한 선수
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> list = new HashMap<>();
        for(String par : participant) list.put(par, list.getOrDefault(par, 0) + 1);
        for(String com : completion) list.put(com, list.get(com) -1);
        
        for(String key : list.keySet()){
            if(list.get(key) != 0){
                answer = key;
        		System.out.println(answer);
        		break;
            }
        }
        return answer;
    }
}