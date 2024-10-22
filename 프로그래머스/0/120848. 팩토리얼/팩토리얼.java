class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int i = 1;
        
        while (factorial <= n) {
            answer = i;
            i++;
            if (Integer.MAX_VALUE / factorial < i) {
                // 다음 팩토리얼 계산 시 int 범위를 넘어갈 경우 루프 종료
                break;
            }
            factorial *= i;
        }
        
        return answer;
    }
}