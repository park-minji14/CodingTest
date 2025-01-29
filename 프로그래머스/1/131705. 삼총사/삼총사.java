class Solution {
    public int solution(int[] number) {
        // 삼총사 조합의 수를 저장할 변수
        int answer = 0;
        
        // 3중 반복문을 통해 모든 가능한 3명 조합을 확인
        // i, j, k는 각각 첫 번째, 두 번째, 세 번째 학생의 인덱스
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 학생의 번호 합이 0인 경우 삼총사로 카운트
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}