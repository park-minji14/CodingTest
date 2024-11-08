class Solution {
    /**
     * 주어진 배열에서 특정 인덱스보다 큰 위치에 있는 1을 찾는 함수
     * @param arr 검색할 정수 배열
     * @param idx 검색을 시작할 인덱스
     * @return 조건을 만족하는 가장 작은 인덱스 또는 -1
     */
    public int solution(int[] arr, int idx) {
        // 결과값을 저장할 변수 초기화
        int answer = -1;
        
        // 배열을 idx부터 끝까지 순회
        for (int i = idx; i < arr.length; i++) {
            // 현재 위치의 값이 1인 경우
            if (arr[i] == 1) {
                answer = i;  // 현재 인덱스를 저장
                break;      // 가장 작은 인덱스를 찾았으므로 반복문 종료
            }
        }
        
        // 결과 반환
        return answer;
    }
}