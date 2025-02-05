class Solution {
    public int solution(int n) {
        // 결과를 저장할 변수 초기화
        int answer = 0;
        
        // 시작 숫자를 1부터 n까지 순회
        // i는 연속된 수의 시작값
        for (int i = 1; i <= n; i++) {
            // 현재 합을 저장할 변수
            int sum = 0;
            // j는 i부터 시작하여 연속된 수를 더함
            for (int j = i; j <= n; j++) {
                sum += j;
                
                // 합이 n과 같으면 방법을 하나 찾은 것이므로 answer 증가
                if (sum == n) {
                    answer++;
                    break;
                }
                // 합이 n보다 커지면 더 이상 진행할 필요 없음
                else if (sum > n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}