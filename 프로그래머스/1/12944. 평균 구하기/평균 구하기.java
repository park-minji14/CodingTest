class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // 배열의 모든 수를 더함
        for(int num : arr) {
            answer += num;
        }
        
        // 총합을 배열 길이로 나누어 평균 계산
        answer = answer / arr.length;
        
        return answer;
    }
}