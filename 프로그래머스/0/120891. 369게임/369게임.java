class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 각 자릿수를 확인
        while (order > 0) {
            int digit = order % 10;  // 현재 자릿수 추출
            
            // 3, 6, 9 확인
            if (digit == 3 || digit == 6 || digit == 9) {
                answer++;  // 3, 6, 9 중 하나면 카운트 증가
            }
            
            order = order / 10;  // 다음 자릿수로 이동
        }
        
        return answer;
    }
}