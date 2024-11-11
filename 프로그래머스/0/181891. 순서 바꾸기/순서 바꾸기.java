class Solution {
    public int[] solution(int[] num_list, int n) {
        // 결과를 저장할 배열 생성
        int[] answer = new int[num_list.length];
        int index = 0;
        
        // n번째 이후의 원소들을 먼저 새 배열에 추가
        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }
        
        // n번째까지의 원소들을 뒤에 추가
        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}