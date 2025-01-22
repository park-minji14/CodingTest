class Solution {
    public long solution(int price, int money, int count) {
        // 총 필요한 금액을 저장할 변수 (long 타입 사용 - 큰 수 계산 대비)
        long totalCost = 0;
        
        // count번 만큼 반복하면서 필요한 총 금액 계산
        for (int i = 1; i <= count; i++) {
            // i번째 이용시의 금액 = 기본 이용료 * i
            totalCost += (long)price * i;
        }
        
        // 필요한 총 금액에서 현재 가진 금액을 뺀 값과 0 중 큰 값을 반환
        return Math.max(0, totalCost - money);
    }
}