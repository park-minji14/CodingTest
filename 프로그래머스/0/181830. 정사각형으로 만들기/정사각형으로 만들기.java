class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;                    // 현재 행의 수
        int cols = arr[0].length;                 // 현재 열의 수
        int max = Math.max(rows, cols);           // 행과 열 중 큰 값
        
        int[][] answer = new int[max][max];       // 정사각형 배열 생성
        
        // 배열 채우기
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < max; j++) {
                // 원본 배열의 범위 내에 있는 경우만 값을 복사
                if(i < rows && j < cols) {
                    answer[i][j] = arr[i][j];
                }
                // 범위를 벗어난 부분은 0으로 자동 초기화됨
            }
        }
        
        return answer;
    }
}