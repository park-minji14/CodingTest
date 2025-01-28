import java.util.Arrays;  // Arrays 클래스 import 추가

class Solution {
    public int solution(int[] d, int budget) {
        // 최대한 많은 부서를 지원하기 위해 작은 금액부터 처리
        Arrays.sort(d);
        
        int count = 0;  // 지원 가능한 부서 수
        int sum = 0;    // 현재까지의 지원 금액 합계
        
        // 금액이 작은 부서부터 차례대로 지원
        for (int amount : d) {
            sum += amount;
            
            // 예산을 초과하면 반복 종료
            if (sum > budget) {
                break;
            }
            
            count++;  // 지원 가능한 부서 수 증가
        }
        
        return count;
    }
}