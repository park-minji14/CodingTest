class Solution {
    public int[] solution(int[] num_list, int n) {
        // n개의 원소를 담을 배열 생성
        int[] answer = new int[n];
        
        // 0부터 n-1까지의 원소들을 새 배열에 복사
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}