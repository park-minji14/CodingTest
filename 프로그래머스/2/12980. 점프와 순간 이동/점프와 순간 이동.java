import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        // 목표 지점에서 시작점(0)까지 거꾸로 이동
        while (n > 0) {
            // n이 짝수이면 순간이동 사용 (배터리 소모 없음)
            if (n % 2 == 0) {
                n /= 2;
            } 
            // n이 홀수이면 한 칸 점프 (배터리 +1 소모)
            else {
                n -= 1;
                ans += 1;
            }
        }
        
        return ans;
    }
}