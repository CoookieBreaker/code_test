//Programmers
//모의고사
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int a_cnt = 0, b_cnt = 0, c_cnt = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(a[i % a.length] == answers[i]) a_cnt++;
            if(b[i % b.length] == answers[i]) b_cnt++;
            if(c[i % c.length] == answers[i]) c_cnt++;
        }
        
        int max = Math.max(Math.max(a_cnt, b_cnt),c_cnt); 
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == a_cnt) list.add(1);
        if(max == b_cnt) list.add(2);
        if(max == c_cnt) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}