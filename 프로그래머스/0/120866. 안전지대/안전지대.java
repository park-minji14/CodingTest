class Solution {
    public int solution(int[][] board) {
        int safeCount = 0;
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    boolean isSafe = true;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < n && nj >= 0 && nj < n && board[ni][nj] == 1) {
                                isSafe = false;
                                break;
                            }
                        }
                        if (!isSafe) {
                            break;
                        }
                    }
                    if (isSafe) {
                        safeCount++;
                    }
                }
            }
        }

        return safeCount;
    }
}