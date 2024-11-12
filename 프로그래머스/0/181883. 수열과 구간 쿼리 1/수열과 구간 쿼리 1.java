class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 배열 복사하여 작업 (원본 보존)
        int[] answer = arr.clone();
        
        // 각 쿼리 처리
        for (int[] query : queries) {
            int start = query[0];  // 시작 인덱스
            int end = query[1];    // 끝 인덱스
            
            // start부터 end까지의 모든 원소에 1을 더함
            for (int i = start; i <= end; i++) {
                answer[i] += 1;
            }
        }
        
        return answer;
    }
}