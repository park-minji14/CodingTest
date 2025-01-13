class Solution {
    public int solution(String[] order) {
        // 음료 가격 상수 정의
        final int AMERICANO_PRICE = 4500;
        final int CAFELATTE_PRICE = 5000;
        int totalPrice = 0;
        
        for (String drink : order) {
            drink = drink.toLowerCase(); // 대소문자 구분 없이 처리
            
            if (drink.contains("cafelatte")) {
                totalPrice += CAFELATTE_PRICE;
            } else if (drink.contains("americano") || drink.equals("anything")) {
                totalPrice += AMERICANO_PRICE;
            }
        }
        
        return totalPrice;
    }
}