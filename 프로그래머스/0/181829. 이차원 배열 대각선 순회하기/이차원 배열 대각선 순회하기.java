class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        // 배열을 순회하면서
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                // i + j가 k 이하인 원소만 더하기
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
}