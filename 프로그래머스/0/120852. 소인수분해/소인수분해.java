import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 소인수를 저장할 HashSet (중복 제거를 위해 Set 사용)
        HashSet<Integer> factors = new HashSet<>();
        
        // 2부터 시작하여 소인수분해
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                factors.add(divisor);  // 소인수 추가
                n /= divisor;          // n을 나눈 몫으로 업데이트
            } else {
                divisor++;            // 나누어 떨어지지 않으면 다음 수로
            }
        }
        
        // HashSet을 배열로 변환
        int[] answer = new int[factors.size()];
        int index = 0;
        for (int factor : factors) {
            answer[index++] = factor;
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}