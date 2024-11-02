class Solution {
    public int solution(int[][] dots) {
        // 4개의 점으로 만들 수 있는 두 선분의 조합을 확인
        
        // 첫 번째 조합: (0,1)(2,3)
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
        
        // 두 번째 조합: (0,2)(1,3)
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }
        
        // 세 번째 조합: (0,3)(1,2)
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }
        
        return 0;
    }
    
    // 두 선분이 평행한지 확인하는 메서드
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        // 기울기 계산시 분모가 0이 되는 것을 방지하기 위해 곱셈 방식 사용
        // (y2-y1)/(x2-x1) == (y4-y3)/(x4-x3) 를
        // (y2-y1)*(x4-x3) == (y4-y3)*(x2-x1) 로 변환
        
        double slope1 = (p2[1] - p1[1]) * (p4[0] - p3[0]);
        double slope2 = (p4[1] - p3[1]) * (p2[0] - p1[0]);
        
        // 두 기울기가 같으면 평행
        return Math.abs(slope1 - slope2) < 0.00001;
    }
}