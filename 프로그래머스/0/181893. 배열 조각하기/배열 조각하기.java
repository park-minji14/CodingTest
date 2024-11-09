class Solution {
    public int[] solution(int[] arr, int[] query) {
        // 현재 처리 중인 배열의 시작과 끝 인덱스를 추적
        int start = 0;
        int end = arr.length - 1;
        
        // query 배열의 각 요소를 순회하면서 처리
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i] 이후의 모든 요소를 자름 (뒷부분 자르기)
                end = Math.min(start + query[i], end);
            } else {
                // 홀수 인덱스: query[i] 이전의 모든 요소를 자름 (앞부분 자르기)
                start = Math.min(start + query[i], end);
            }
        }
        
        // 최종 결과 배열 생성
        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[start + i];
        }
        
        return answer;
    }
}