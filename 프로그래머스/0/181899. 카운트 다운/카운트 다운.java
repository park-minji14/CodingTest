class Solution {
    public int[] solution(int start_num, int end_num) {
        // start_num부터 end_num까지의 개수 계산
        int size = start_num - end_num + 1;
        
        // 결과를 저장할 배열 생성
        int[] answer = new int[size];
        
        // start_num부터 1씩 감소하면서 배열에 저장
        for (int i = 0; i < size; i++) {
            answer[i] = start_num - i;
        }
        
        return answer;
    }
}