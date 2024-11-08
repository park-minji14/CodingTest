class Solution {
    public int[] solution(int n, int k) {
        // n 이하의 k의 배수 개수 계산
        // 예: n=10, k=3일 때 3의 배수는 3,6,9로 3개
        int count = n / k;
        
        // k의 배수를 저장할 배열 생성
        int[] answer = new int[count];
        
        // k의 배수를 차례대로 저장
        for (int i = 0; i < count; i++) {
            answer[i] = k * (i + 1);
        }
        
        return answer;
    }
}