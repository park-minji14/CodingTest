class Solution {
    public int solution(int n) {
        // 소수 개수를 저장할 변수
        int answer = 0;
        
        // 0부터 n까지의 숫자가 소수인지 여부를 저장할 배열
        // false는 소수, true는 소수가 아님을 의미
        boolean[] isNotPrime = new boolean[n + 1];
        
        // 0과 1은 소수가 아님
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        // 에라토스테네스의 체 알고리즘 구현
        for (int i = 2; i * i <= n; i++) {
            // i가 소수가 아니면 건너뜀
            if (isNotPrime[i]) {
                continue;
            }
            
            // i가 소수라면, i의 배수들은 소수가 아님
            for (int j = i * i; j <= n; j += i) {
                isNotPrime[j] = true;
            }
        }
        
        // 소수의 개수 세기
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}