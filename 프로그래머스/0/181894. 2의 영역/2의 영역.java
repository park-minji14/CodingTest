class Solution {
    public int[] solution(int[] arr) {
        // 2가 있는 첫 번째와 마지막 인덱스를 저장할 변수
        int firstIdx = -1;
        int lastIdx = -1;
        
        // 배열을 순회하면서 2의 위치 찾기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                // 첫 번째 2를 찾았을 때
                if(firstIdx == -1) {
                    firstIdx = i;
                }
                // 마지막 2의 위치 갱신
                lastIdx = i;
            }
        }
        
        // 2를 찾지 못한 경우
        if(firstIdx == -1) {
            return new int[]{-1};
        }
        
        // 결과 배열의 크기 계산
        int[] answer = new int[lastIdx - firstIdx + 1];
        
        // 첫 번째 2부터 마지막 2까지의 부분 배열 복사
        for(int i = firstIdx; i <= lastIdx; i++) {
            answer[i - firstIdx] = arr[i];
        }
        
        return answer;
    }
}