class Solution {
    public int[][] solution(int n) {
        // 결과를 저장할 n x n 배열
        int[][] answer = new int[][] {};
        answer = new int[n][n];
        
        // 방향을 정의 (우, 하, 좌, 상 순서)
        int[] dx = {0, 1, 0, -1};  // 행 이동
        int[] dy = {1, 0, -1, 0};  // 열 이동
        
        int x = 0;  // 현재 행 위치
        int y = 0;  // 현재 열 위치
        int dir = 0;  // 현재 방향 (0:우, 1:하, 2:좌, 3:상)
        
        // 1부터 n*n까지 숫자를 배치
        for(int i = 1; i <= n*n; i++) {
            answer[x][y] = i;  // 현재 위치에 숫자 배치
            
            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 다음 위치가 범위를 벗어나거나 이미 숫자가 있는 경우
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;  // 방향 전환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;  // 다음 위치로 이동
            y = ny;
        }
        
        return answer;
    }
}