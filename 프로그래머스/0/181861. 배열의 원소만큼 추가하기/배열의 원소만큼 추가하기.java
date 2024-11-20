class Solution {
    public int[] solution(int[] arr) {
        int totalLength = 0;
        for (int num : arr) {
            totalLength += num;
        }
        
        int[] answer = new int[totalLength];
        int index = 0;
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer[index++] = num;
            }
        }
        return answer;
    }
}