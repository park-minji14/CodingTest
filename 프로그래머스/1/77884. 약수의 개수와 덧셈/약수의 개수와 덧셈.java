class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left부터 right까지 각 숫자를 순회
        for (int num = left; num <= right; num++) {
            // 약수의 개수가 짝수면 더하고, 홀수면 뺌
            if (countDivisors(num) % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }
    
    // 약수의 개수를 계산하는 메서드
    private int countDivisors(int number) {
        int count = 0;
        
        // 1부터 해당 숫자의 제곱근까지만 검사
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                // i가 약수인 경우
                count++;
                
                // number/i도 약수이며, i와 다른 경우 (예: 16의 약수 2와 8)
                if (i * i != number) {
                    count++;
                }
            }
        }
        
        return count;
    }
}