class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        // arr 배열의 길이가 홀수인 경우
        if (arr.length % 2 != 0) {
            answer = new int[arr.length];
            
            // arr 배열의 짝수 인덱스 위치에 n 을 더함
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        // arr 배열의 길이가 짝수인 경우
        else {
            answer = new int[arr.length];
            
            // arr 배열의 홀수 인덱스 위치에 n 을 더함
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        
        return answer;
    }
}