class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 장군개미 (공격력 5)
        answer += hp / 5;
        hp %= 5;
        
        // 병정개미 (공격력 3)
        answer += hp / 3;
        hp %= 3;
        
        // 일개미 (공격력 1)
        answer += hp;
        
        return answer;
    }
}