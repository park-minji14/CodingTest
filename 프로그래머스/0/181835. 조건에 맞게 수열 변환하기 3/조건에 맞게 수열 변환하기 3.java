class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) { // k가 홀수인 경우
                answer[i] = arr[i] * k;
            } else { // k가 짝수인 경우
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}