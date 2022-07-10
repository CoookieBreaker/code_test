//Programmers
//자릿수 더하기

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        
        for(int i = 0; i < num.length(); i++){
            String tmp = num.substring(i, i+1);
            answer += Integer.parseInt(tmp);
        }
       
        return answer;
    }
}