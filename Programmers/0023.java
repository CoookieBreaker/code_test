//Programmers
//부족한 금액 계산하기
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            long num = price * i;
            answer += num;
            System.out.println(answer);
        }

        if (answer > money)
            answer -= money;
        else
            return 0;

        return answer;
    }
}