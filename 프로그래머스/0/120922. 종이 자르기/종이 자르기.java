class Solution {
    public int solution(int M, int N) {
        // 이미 1x1 크기라면 자를 필요가 없으므로 0을 반환
        if (M == 1 && N == 1) return 0;
        
        // 종이를 1x1로 자르는데 필요한 최소 가위질 횟수는
        // 가로로 자르는 횟수 (M-1) + 
        // 세로로 자르는 횟수 (N-1) * 가로 조각 수 (M)
        return (M-1) + (M * (N-1));
    }
}