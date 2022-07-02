//Programmers
//평균 구하기

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double result = 0;
        int c = 0;

        for (int i = 0; i < arr.length; i++) {

            result += arr[i];
            c++;
        }
        answer = result / c;
        return answer;
    }
}