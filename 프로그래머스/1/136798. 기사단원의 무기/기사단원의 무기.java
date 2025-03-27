class Solution {
    public int solution(int number, int limit, int power) {
        int totalWeight = 0; // 필요한 철의 총 무게를 저장할 변수
        
        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i); // 현재 숫자의 약수 개수 계산
            
            // 만약 약수 개수가 제한 수치를 초과하면 power 값 사용
            if (divisorCount > limit) {
                totalWeight += power;
            } else {
                totalWeight += divisorCount;
            }
        }
        
        return totalWeight; // 최종적으로 필요한 철의 총 무게 반환
    }
    
    // 숫자의 약수 개수를 구하는 메서드
    private int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) { // i의 범위를 √num까지 최적화
            if (num % i == 0) {
                count++; // i가 약수이면 증가
                if (i != num / i) { // 중복 방지 (제곱수가 아닐 경우)
                    count++;
                }
            }
        }
        return count;
    }
}