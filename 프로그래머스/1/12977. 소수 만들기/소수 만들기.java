import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        
        // 3개의 숫자를 선택하는 모든 조합을 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수인지 확인하는 함수 호출
                    if (isPrime(sum)) {
                        answer++; // 소수이면 카운트 증가
                    }
                }
            }
        }
        
        return answer;
    }
    
    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) return false; // 2보다 작은 수는 소수가 아님
        
        for (int i = 2; i <= Math.sqrt(num); i++) { // 제곱근까지만 확인하여 최적화
            if (num % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 나누어 떨어지지 않으면 소수
    }
}