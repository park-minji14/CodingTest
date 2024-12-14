class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        // x를 long으로 변환 (큰 수 처리를 위해)
        long num = x;
        
        // n번 반복하면서 배열 채우기
        for(int i = 0; i < n; i++) {
            answer[i] = num * (i + 1);
        }
        
        return answer;
    }
}