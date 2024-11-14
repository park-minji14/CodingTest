class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            // 50미만의 홀수는 2를 곱함
            if(arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } 
            // 50이상의 짝수는 2로 나눔
            else if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            }
            // 나머지는 그대로
            else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}