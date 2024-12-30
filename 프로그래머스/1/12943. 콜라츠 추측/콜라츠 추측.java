class Solution {
    public int solution(int num) {
        // 입력값이 1이면 0 반환
        if(num == 1) return 0;
        
        long n = num; // int 범위 초과 방지를 위해 long 사용
        int count = 0; // 작업 횟수
        
        // 1이 될 때까지 반복
        while(n != 1) {
            // 500번 넘어가면 -1 반환
            if(count >= 500) return -1;
            
            // 짝수면 2로 나누기
            if(n % 2 == 0) {
                n = n / 2;
            } 
            // 홀수면 3을 곱하고 1 더하기
            else {
                n = n * 3 + 1;
            }
            
            count++;
        }
        
        return count;
    }
}