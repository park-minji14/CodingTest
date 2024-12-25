class Solution {
    public long solution(long n) {
        // 제곱근 계산
        double sqrt = Math.sqrt(n);
        
        // 제곱근이 정수인지 확인
        if(sqrt == (long)sqrt) {
            // 정수라면 (sqrt + 1)의 제곱 반환
            return (long)(sqrt + 1) * (long)(sqrt + 1);
        } else {
            // 정수가 아니라면 -1 반환
            return -1;
        }
    }
}