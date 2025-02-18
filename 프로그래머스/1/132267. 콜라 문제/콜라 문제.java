class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int currentBottles = n;
        
        while (currentBottles >= a) {
            // 현재 보유한 빈 병으로 교환 가능한 콜라의 수 계산
            int exchangeableGroups = currentBottles / a;
            int newColas = exchangeableGroups * b;
            
            // 받은 콜라의 수를 정답에 추가
            answer += newColas;
            
            // 다음 교환을 위한 빈 병 계산
            // 교환하고 남은 병 + 새로 받은 콜라 병
            currentBottles = (currentBottles % a) + newColas;
        }
        
        return answer;
    }
}