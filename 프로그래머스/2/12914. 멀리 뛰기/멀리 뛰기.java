class Solution {
    public long solution(int n) {
        // n이 1이하일 경우 바로 결과 반환
        if (n <= 1) return 1;
        
        // dp 배열 선언 (피보나치 수열을 저장할 배열)
        long[] dp = new long[n + 1];
        
        // 초기값 설정
        dp[0] = 1; // 아무것도 안 뛰는 경우도 1가지 방법으로 침
        dp[1] = 1; // 1칸 뛰는 방법 1가지
        
        // 피보나치 수열 계산
        // i번째 칸까지 도달하는 방법의 수는
        // (i-1)번째 칸에서 1칸 뛰는 경우 + (i-2)번째 칸에서 2칸 뛰는 경우의 합
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        
        // n번째 칸까지의 방법의 수 반환
        return dp[n];
    }
}