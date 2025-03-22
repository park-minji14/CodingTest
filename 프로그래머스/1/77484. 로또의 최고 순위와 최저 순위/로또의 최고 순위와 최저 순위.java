class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 맞은 번호의 수와 알아볼 수 없는 번호의 수를 카운트할 변수 선언
        int correctCount = 0;  // 민우가 가진 번호 중 당첨 번호와 일치하는 개수
        int zeroCount = 0;     // 민우가 가진 번호 중 알아볼 수 없는 번호(0)의 개수
        
        // 민우가 가진 번호를 순회하며 당첨 번호와 일치하는 개수와 0의 개수를 센다
        for (int lotto : lottos) {
            if (lotto == 0) {
                // 알아볼 수 없는 번호인 경우
                zeroCount++;
            } else {
                // 번호를 알 수 있는 경우, 당첨 번호와 비교
                for (int win : win_nums) {
                    if (lotto == win) {
                        // 당첨 번호와 일치하는 경우
                        correctCount++;
                        break;  // 같은 번호를 찾았으므로 내부 루프 종료
                    }
                }
            }
        }
        
        // 최고 순위 계산 (맞은 번호 + 0을 모두 당첨 번호로 간주)
        int maxCorrect = correctCount + zeroCount;
        
        // 최저 순위 계산 (현재 맞은 번호만 고려)
        int minCorrect = correctCount;
        
        // 순위 변환 (맞은 개수 -> 순위)
        // 1등: 6개 일치, 2등: 5개 일치, ..., 5등: 2개 일치, 6등(낙첨): 1개 이하 일치
        int maxRank = getRank(maxCorrect);
        int minRank = getRank(minCorrect);
        
        // 결과 배열 반환 [최고 순위, 최저 순위]
        return new int[] {maxRank, minRank};
    }
    
    // 맞은 개수를 순위로 변환하는 메서드
    private int getRank(int correctCount) {
        switch (correctCount) {
            case 6:
                return 1;  // 1등: 6개 일치
            case 5:
                return 2;  // 2등: 5개 일치
            case 4:
                return 3;  // 3등: 4개 일치
            case 3:
                return 4;  // 4등: 3개 일치
            case 2:
                return 5;  // 5등: 2개 일치
            default:
                return 6;  // 6등(낙첨): 1개 이하 일치
        }
    }
}