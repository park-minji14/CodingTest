class Solution {
    public int solution(int[] citations) {
        // H-Index 계산을 위한 함수
        
        // 정렬을 사용하지 않는 방법으로 해결
        // h값을 0부터 논문 수까지 모든 가능한 값을 검사
        
        int n = citations.length; // 전체 논문 수
        int answer = 0;
        
        // 0부터 논문 수까지의 모든 가능한 h값을 검사
        for (int h = 0; h <= n; h++) {
            int count = 0; // h번 이상 인용된 논문 수
            
            // 모든 논문을 확인하며 h번 이상 인용된 논문 개수 세기
            for (int citation : citations) {
                if (citation >= h) {
                    count++;
                }
            }
            
            // h번 이상 인용된 논문이 h편 이상이면 h값 갱신
            if (count >= h) {
                answer = h; // 현재까지의 최대 h값 저장
            } else {
                // count < h인 경우는 이후 h값이 더 커져도 조건을 만족할 수 없음
                // 따라서 더 이상 검사할 필요 없이 반복문 종료
                break;
            }
        }
        
        return answer;
    }
}