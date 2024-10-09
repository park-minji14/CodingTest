class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            // i와 j 위치의 원소 교환
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        
        return answer;
    }
}