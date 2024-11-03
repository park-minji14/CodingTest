class Solution {
    public int solution(int chicken) {
        // 서비스 치킨의 총 개수를 저장할 변수
        int serviceChicken = 0;
        
        // 현재 가지고 있는 쿠폰 수 (처음에는 주문한 치킨 수만큼)
        int coupon = chicken;
        
        // 쿠폰이 10장 이상일 때까지 반복
        while (coupon >= 10) {
            // 현재 쿠폰으로 받을 수 있는 서비스 치킨 수 계산
            int newChicken = coupon / 10;
            // 남은 쿠폰 수 계산
            int remainCoupon = coupon % 10;
            
            // 서비스 치킨 총 개수에 추가
            serviceChicken += newChicken;
            // 새로운 쿠폰 = 서비스 치킨으로 받은 쿠폰 + 남은 쿠폰
            coupon = newChicken + remainCoupon;
        }
        
        return serviceChicken;
    }
}