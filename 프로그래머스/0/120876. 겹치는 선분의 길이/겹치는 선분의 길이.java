class Solution {
    public int solution(int[][] lines) {
        // -100부터 100까지의 각 지점에서 선분이 몇 개 있는지 카운트
        int[] counts = new int[201];  // -100~100을 0~200으로 매핑
        
        // 각 선분을 순회하면서 해당하는 위치의 카운트 증가
        for (int[] line : lines) {
            // 시작점과 끝점을 0~200 범위로 매핑
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            // 선분이 지나는 모든 위치의 카운트 증가
            for (int i = start; i < end; i++) {
                counts[i]++;
            }
        }
        
        // 두 개 이상의 선분이 겹치는 부분의 길이 계산
        int answer = 0;
        for (int i = 0; i < 201; i++) {
            if (counts[i] >= 2) {  // 2개 이상의 선분이 겹치는 경우
                answer++;
            }
        }
        
        return answer;
    }
}