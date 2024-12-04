class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 두 주사위 숫자가 모두 홀수인 경우
        if (a % 2 == 1 && b % 2 == 1) {
            answer = a * a + b * b;
        }
        // 두 주사위 숫자 중 하나만 홀수인 경우
        else if ((a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1)) {
            answer = 2 * (a + b);
        }
        // 두 주사위 숫자가 모두 짝수인 경우
        else {
            answer = Math.abs(a - b);
        }
        
        return answer;
    }
}