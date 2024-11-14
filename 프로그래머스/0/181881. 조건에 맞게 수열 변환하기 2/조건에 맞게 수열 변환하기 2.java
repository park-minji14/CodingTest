class Solution {
    public int solution(int[] arr) {
        // 반복 횟수를 카운트할 변수
        int count = 0;
        
        while (true) {
            // 이전 배열의 상태를 저장할 새로운 배열 생성
            int[] prevArr = arr.clone();
            
            // 배열의 각 원소를 순회하면서 조건에 따라 값을 변경
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {  // 50보다 크거나 같은 짝수인 경우
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {  // 50보다 작은 홀수인 경우
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            // 반복 횟수 증가
            count++;
            
            // 이전 배열과 현재 배열이 같은지 확인
            boolean isSame = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != prevArr[i]) {
                    isSame = false;
                    break;
                }
            }
            
            // 배열이 더 이상 변하지 않으면 반복 종료
            if (isSame) {
                break;
            }
        }
        
        return count - 1;  // 문제 조건에 따라 마지막 반복은 제외
    }
}