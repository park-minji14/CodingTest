class Solution {
    private boolean[] visited; // 던전 방문 여부를 저장할 배열
    private int maxCount = 0;  // 최대 던전 탐험 수
    
    /**
     * 유저가 탐험할 수 있는 최대 던전 수를 반환하는 함수
     * @param k 유저의 현재 피로도
     * @param dungeons 각 던전별 [최소 필요 피로도, 소모 피로도]가 담긴 2차원 배열
     * @return 탐험할 수 있는 최대 던전 수
     */
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length]; // 방문 배열 초기화
        
        // DFS로 모든 가능한 던전 순서 탐색
        dfs(k, dungeons, 0);
        
        return maxCount;
    }
    
    /**
     * DFS를 이용해 모든 가능한 던전 순서를 탐색하는 함수
     * @param fatigue 현재 남은 피로도
     * @param dungeons 던전 정보 배열
     * @param count 현재까지 탐험한 던전 수
     */
    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 현재까지 탐험한 던전 수가 최대값보다 크면 최대값 갱신
        maxCount = Math.max(maxCount, count);
        
        // 모든 던전을 순회하며 탐험 가능 여부 확인
        for (int i = 0; i < dungeons.length; i++) {
            // 아직 방문하지 않았고, 현재 피로도가 최소 필요 피로도 이상인 경우
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true; // 방문 처리
                
                // 다음 던전 탐험 (피로도 감소, 탐험 수 증가)
                dfs(fatigue - dungeons[i][1], dungeons, count + 1);
                
                visited[i] = false; // 방문 처리 취소 (백트래킹)
            }
        }
    }
}