class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제곱근을 구한다
        double sqrt = Math.sqrt(n);
        
        // 제곱근이 정수라면 제곱수
        if (sqrt == (int)sqrt) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}