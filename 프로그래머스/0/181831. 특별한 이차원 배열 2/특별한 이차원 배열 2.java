class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        
        // 모든 위치 확인
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // 대칭되는 위치의 값이 다르면 0 반환
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        
        // 모든 검사를 통과하면 1 반환
        return 1;
    }
}