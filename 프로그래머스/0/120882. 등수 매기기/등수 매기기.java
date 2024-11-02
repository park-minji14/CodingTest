class Solution {
    public int[] solution(int[][] score) {
        // 결과를 저장할 배열 생성
        int[] answer = new int[score.length];
        
        // 평균 점수를 저장할 배열
        double[] avg = new double[score.length];
        
        // 각 학생의 평균 점수 계산
        for(int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 각 학생의 등수 계산
        for(int i = 0; i < score.length; i++) {
            int rank = 1; // 기본 등수는 1등으로 시작
            
            // 다른 모든 학생과 비교
            for(int j = 0; j < score.length; j++) {
                // 현재 학생보다 점수가 높은 학생이 있으면 등수 1씩 증가
                if(avg[i] < avg[j]) {
                    rank++;
                }
            }
            
            // 계산된 등수 저장
            answer[i] = rank;
        }
        
        return answer;
    }
}