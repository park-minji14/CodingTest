class Solution {
    public int solution(String dirs) {
        // 방문한 경로를 저장할 집합
        // 경로는 (시작x, 시작y, 도착x, 도착y) 형태로 저장
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        // 캐릭터의 현재 위치 (0,0)에서 시작
        // 좌표계를 (-5,-5)~(5,5)에서 (0,0)~(10,10)으로 변환하여 사용
        // 즉, (0,0)은 (5,5)로 변환됨
        int x = 5;
        int y = 5;
        
        // 처음 걸어본 길의 개수
        int count = 0;
        
        // 각 명령어에 대해 처리
        for (char dir : dirs.toCharArray()) {
            // 다음 위치 계산
            int nx = x;
            int ny = y;
            
            // 명령어에 따라 다음 위치 갱신
            switch (dir) {
                case 'U': // 위로 이동
                    ny += 1;
                    break;
                case 'D': // 아래로 이동
                    ny -= 1;
                    break;
                case 'R': // 오른쪽으로 이동
                    nx += 1;
                    break;
                case 'L': // 왼쪽으로 이동
                    nx -= 1;
                    break;
            }
            
            // 좌표평면의 경계를 넘어가는 경우 무시
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) {
                continue;
            }
            
            // 이전에 방문하지 않은 길인 경우 카운트 증가
            // 길은 양방향이므로 (A->B)와 (B->A)는 같은 길로 취급
            if (!visited[x][y][nx][ny] && !visited[nx][ny][x][y]) {
                visited[x][y][nx][ny] = true; // A->B 방문 표시
                visited[nx][ny][x][y] = true; // B->A 방문 표시(같은 길의 반대 방향)
                count++;
            }
            
            // 현재 위치 갱신
            x = nx;
            y = ny;
        }
        
        return count;
    }
}