class Solution {
    public int solution(int n) {
        // 피보나치 수열의 결과값을 저장할 배열 선언
        int[] fibo = new int[n + 1];
        
        // 피보나치 수열의 첫 두 항 초기화
        fibo[0] = 0;
        fibo[1] = 1;
        
        // n까지의 피보나치 수열 계산
        for(int i = 2; i <= n; i++) {
            // (A + B) % C = ((A % C) + (B % C)) % C
            // 위 성질을 사용하여 오버플로우 방지
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        }
        
        // n번째 피보나치 수를 1234567로 나눈 나머지 반환
        return fibo[n];
    }
}