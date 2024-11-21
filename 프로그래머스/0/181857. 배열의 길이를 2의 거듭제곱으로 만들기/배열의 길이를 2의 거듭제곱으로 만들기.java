class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int newLength = 1;
        
        // 2의 정수 거듭제곱으로 만들기
        while (newLength < length) {
            newLength *= 2;
        }
        
        int[] answer = new int[newLength];
        
        // 원래 배열 값 복사
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        
        // 나머지 값을 0으로 초기화
        for (int i = length; i < newLength; i++) {
            answer[i] = 0;
        }
        
        return answer;
    }
}