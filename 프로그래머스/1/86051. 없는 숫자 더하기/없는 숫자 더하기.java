class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 0~9까지 합
        
        // 배열의 모든 수를 전체 합에서 빼기
        for(int num : numbers) {
            answer -= num;
        }
        
        return answer;
    }
}