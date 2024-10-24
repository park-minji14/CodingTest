class Solution {
    public int solution(int[] sides) {
        int maxSide = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int sum = sides[0] + sides[1] + sides[2];
        
        // 가장 긴 변을 제외한 두 변의 합
        int otherSum = sum - maxSide;
        
        // 삼각형 성립 조건 검사
        return (maxSide < otherSum) ? 1 : 2;
    }
}