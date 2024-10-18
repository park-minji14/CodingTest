class Solution {
    public int solution(int balls, int share) {
        long[][] dp = new long[balls + 1][share + 1];
        
        for (int i = 0; i <= balls; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= Math.min(i, share); j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                if (dp[i][j] > Integer.MAX_VALUE) dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        return (int) dp[balls][share];
    }
}