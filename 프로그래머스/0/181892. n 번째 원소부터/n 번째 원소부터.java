class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 원소부터 마지막 원소까지의 길이 계산
        int resultLength = num_list.length - (n - 1);
        
        // 결과를 저장할 배열 생성
        int[] answer = new int[resultLength];
        
        // n번째 원소부터 마지막 원소까지 복사
        // n은 1부터 시작하므로 배열 인덱스로 변환시 (n-1) 사용
        for (int i = 0; i < resultLength; i++) {
            answer[i] = num_list[i + (n-1)];
        }
        
        return answer;
    }
}