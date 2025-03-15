import java.util.*;

class Solution {
    // 상하좌우 이동을 위한 배열
    int[] dx = {-1, 1, 0, 0}; // 행 이동 (상, 하)
    int[] dy = {0, 0, -1, 1}; // 열 이동 (좌, 우)
    
    public int solution(int[][] maps) {
        int n = maps.length;    // 맵의 행 크기
        int m = maps[0].length; // 맵의 열 크기
        
        // 방문 여부와 거리를 저장할 2차원 배열
        int[][] visited = new int[n][m];
        
        // BFS 탐색을 위한 큐
        Queue<int[]> queue = new LinkedList<>();
        
        // 시작 위치 (0,0)을 큐에 넣고 방문 표시 (문제에서는 (1,1)이지만 배열 인덱스는 0부터 시작)
        queue.offer(new int[]{0, 0});
        visited[0][0] = 1; // 시작 위치도 카운트에 포함
        
        // BFS 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            // 현재 위치가 목적지인 경우 (맵의 우측 하단)
            if (x == n - 1 && y == m - 1) {
                return visited[x][y]; // 목적지까지의 거리 반환
            }
            
            // 상하좌우 네 방향으로 이동 시도
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 맵 범위 내에 있고, 벽이 아니며, 아직 방문하지 않은 경우
                if (nx >= 0 && nx < n && ny >= 0 && ny < m 
                    && maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                    // 다음 위치를 큐에 추가
                    queue.offer(new int[]{nx, ny});
                    // 현재까지의 이동 거리 + 1을 기록
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
        
        // 목적지에 도달할 수 없는 경우
        return -1;
    }
}