//Programmers
//하샤드 수

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String num = String.valueOf(x);
        int result = 0;

        for(int i = 0; i < num.length(); i++){
            String tmp = num.substring(i, i+1);
            result += Integer.parseInt(tmp);
        }
        
        if(x % result != 0){
            answer = false;
        }
        
        
        
        return answer;
    }
}