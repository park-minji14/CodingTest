class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];  // 첫 번째 수를 기본값으로 설정
        int minDiff = Math.abs(n - array[0]);  // 첫 번째 수와의 차이를 최소 차이로 설정
        
        // 배열의 모든 수를 확인
        for(int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(n - array[i]);
            
            // 현재 차이가 최소 차이보다 작은 경우
            if(currentDiff < minDiff) {
                minDiff = currentDiff;
                answer = array[i];
            }
            // 차이가 같은 경우 더 작은 수를 선택
            else if(currentDiff == minDiff && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}