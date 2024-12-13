class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 숫자가 0이 될 때까지 반복
        while (n > 0) {
            // 현재 숫자의 마지막 자리를 구함 (나머지)
            answer += n % 10;
            // 마지막 자리를 없애고 다음 자리로 이동
            n = n / 10;
        }
        
        return answer;
    }
}