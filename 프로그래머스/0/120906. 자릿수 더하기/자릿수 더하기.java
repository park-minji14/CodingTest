class Solution {
    public int solution(int n) {
        // 수학적 연산 사용
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;  // 현재 마지막 자리수를 더함
            n /= 10;          // 다음 자리수로 이동
        }
        
        return answer;
    }
}