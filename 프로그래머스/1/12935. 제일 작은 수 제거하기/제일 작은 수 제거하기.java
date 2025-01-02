class Solution {
    public int[] solution(int[] arr) {
        // 길이가 1이면 [-1] 반환
        if(arr.length == 1) {
            return new int[]{-1};
        }
        
        // 가장 작은 수의 위치 찾기
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        
        // 가장 작은 수를 제외한 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(i != minIndex) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}