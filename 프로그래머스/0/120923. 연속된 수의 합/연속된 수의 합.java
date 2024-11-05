class Solution {
    public int[] solution(int num, int total) {
        // 결과를 저장할 배열 생성
        int[] answer = new int[num];
        
        int start = (total - (num * (num-1) / 2)) / num;
        
        // 시작 숫자부터 num개의 연속된 수를 배열에 저장
        for(int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}