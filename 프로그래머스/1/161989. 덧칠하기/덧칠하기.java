class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;        // 페인트칠 횟수
        int covered = 0;       // 현재까지 칠해진 위치
        
        for (int pos : section) {
            // 현재 위치가 이미 칠해진 영역이면 건너뜀
            if (pos <= covered) {
                continue;
            }
            
            // 롤러로 칠하기 (현재 위치부터 롤러 길이만큼)
            covered = pos + m - 1;
            answer++;
        }
        
        return answer;
    }
}