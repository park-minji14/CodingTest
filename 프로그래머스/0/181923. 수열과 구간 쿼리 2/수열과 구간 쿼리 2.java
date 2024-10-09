class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minGreaterThanK = Integer.MAX_VALUE;
            boolean found = false;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < minGreaterThanK) {
                    minGreaterThanK = arr[j];
                    found = true;
                }
            }
            
            answer[i] = found ? minGreaterThanK : -1;
        }
        
        return answer;
    }
}