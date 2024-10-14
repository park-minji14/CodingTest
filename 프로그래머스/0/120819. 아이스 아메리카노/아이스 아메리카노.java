class Solution {
    public int[] solution(int money) {
        final int AMERICANO_PRICE = 5500;
        
        int cups = money / AMERICANO_PRICE;
        int change = money % AMERICANO_PRICE;
        
        int[] answer = {cups, change};
        return answer;
    }
}