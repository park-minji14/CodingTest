class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 첫 번째 구간과 두 번째 구간의 시작과 끝 인덱스
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];
        
        // 각 구간의 길이 계산
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        
        // 결과 배열 생성
        int[] answer = new int[len1 + len2];
        int idx = 0;
        
        // 첫 번째 구간의 배열 복사
        for(int i = start1; i <= end1; i++) {
            answer[idx++] = arr[i];
        }
        
        // 두 번째 구간의 배열 복사
        for(int i = start2; i <= end2; i++) {
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}