//Programmers
//K번째수

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] result = {};
        int i = 0, j = 0, k = 0;
        
        for(int a = 0; a < commands.length; a++){
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];
            
            int count = 0;
            
            result = new int[j-i+1];
            
            for(int b = i-1; b <= j-1; b++){
                result[count] = array[b];
                count++;
            }
            Arrays.sort(result);
            answer[a] = result[k-1];
        }
        
        return answer;
    }
}