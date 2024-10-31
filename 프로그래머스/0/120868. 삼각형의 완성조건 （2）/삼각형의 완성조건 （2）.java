class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // 가장 긴 변이 sides[0]과 sides[1] 중 하나일 때
        for (int i = max + 1 - min; i <= max; i++) {
            if (i <= 1000 && i < max + min) {
                answer++;
            }
        }
        
        // 나머지 한 변이 가장 긴 변일 때
        for (int i = 1; i < max + min - min; i++) {
            if (i <= 1000 && Math.abs(max - i) < min) {
                answer++;
            }
        }
        
        return answer;
    }
}