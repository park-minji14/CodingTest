import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 원하는 제품과 수량을 Map에 저장
        Map<String, Integer> wishList = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wishList.put(want[i], number[i]);
        }
        
        // 할인 기간이 최소 10일 이상이어야 함
        if (discount.length < 10) {
            return 0;
        }
        
        // 슬라이딩 윈도우 적용 (10일 연속 할인 기간)
        for (int i = 0; i <= discount.length - 10; i++) {
            // 현재 10일 동안의 할인 제품을 카운트
            Map<String, Integer> currentDiscount = new HashMap<>();
            
            // i일부터 i+9일까지의 할인 제품 카운트
            for (int j = i; j < i + 10; j++) {
                String product = discount[j];
                currentDiscount.put(product, currentDiscount.getOrDefault(product, 0) + 1);
            }
            
            // 원하는 모든 제품을 원하는 수량만큼 구매할 수 있는지 확인
            boolean canBuyAll = true;
            for (String item : wishList.keySet()) {
                // 원하는 제품이 할인되지 않거나, 원하는 수량보다 적게 할인된 경우
                if (currentDiscount.getOrDefault(item, 0) < wishList.get(item)) {
                    canBuyAll = false;
                    break;
                }
            }
            
            // 원하는 모든 제품을 살 수 있으면 카운트 증가
            if (canBuyAll) {
                answer++;
            }
        }
        
        return answer;
    }
}