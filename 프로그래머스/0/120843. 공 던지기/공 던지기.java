class Solution {
    public int solution(int[] numbers, int k) {
        int playerCount = numbers.length;
        int currentIndex = 0;
        
        // k-1번 던지기 (마지막 던지기의 결과를 반환해야됨)
        for (int i = 0; i < k - 1; i++) {
            currentIndex = (currentIndex + 2) % playerCount;
        }
        
        return numbers[currentIndex];
    }
}