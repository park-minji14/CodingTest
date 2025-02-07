class Solution {
    public int solution(int n) {
        // 1. 입력받은 n을 2진수로 변환했을 때 1의 개수를 계산
        int oneCount = Integer.bitCount(n);
        
        // 2. n보다 큰 수를 하나씩 확인
        int answer = n + 1;
        
        // 3. n보다 큰 수들 중에서 2진수 1의 개수가 같은 최솟값을 찾기
        while(true) {
            // 현재 숫자(answer)의 2진수 1의 개수 계산
            int currentCount = Integer.bitCount(answer);
            
            // 1의 개수가 같으면 해당 숫자가 정답
            if(oneCount == currentCount) {
                break;
            }
            
            // 다음 숫자 확인
            answer++;
        }
        
        return answer;
    }
}