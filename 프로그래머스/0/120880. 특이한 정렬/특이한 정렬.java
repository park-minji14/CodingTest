class Solution {
    public int[] solution(int[] numlist, int n) {
        // 결과를 저장할 배열 생성
        int[] answer = new int[numlist.length];
        
        // 정렬을 위해 원본 배열 복사
        for(int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }
        
        // 버블정렬 사용 (더 효율적인 정렬도 가능하지만 이해하기 쉽게 구현)
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = 0; j < answer.length - 1 - i; j++) {
                // n과의 차이(절대값) 계산
                int diff1 = Math.abs(answer[j] - n);
                int diff2 = Math.abs(answer[j + 1] - n);
                
                // n과의 거리가 같은 경우, 더 큰 수가 앞으로 오도록
                if(diff1 == diff2 && answer[j] < answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
                // n과의 거리가 더 먼 수가 뒤로 가도록
                else if(diff1 > diff2) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        
        return answer;
    }
}