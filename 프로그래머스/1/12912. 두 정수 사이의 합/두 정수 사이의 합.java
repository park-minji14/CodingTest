class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 시작값과 끝값 정하기
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        // start부터 end까지 모든 수 더하기
        for(int i = start; i <= end; i++) {
            answer += i;
        }
        
        return answer;
    }
}