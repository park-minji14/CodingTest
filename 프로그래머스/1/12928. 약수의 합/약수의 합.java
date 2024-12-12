class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 쭉 돌면서
        for(int i = 1; i <= n; i++) {
            // n을 i로 나눴을때 깔끔하게 나눠지면 약수
            if(n % i == 0) {
                // 약수를 발견할때마다 더해주기
                answer += i;
            }
        }
        
        return answer;
    }
}