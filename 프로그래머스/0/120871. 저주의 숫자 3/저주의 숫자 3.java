class Solution {
    public int solution(int n) {
        // 결과값을 저장할 변수
        int answer = 0;
        
        // 1부터 n까지 반복하면서 3x 마을의 숫자 카운트
        int count = 0;
        
        // 1부터 숫자를 하나씩 증가시키면서 체크
        for (int i = 1; count < n; i++) {
            // 현재 숫자 i가 3x 마을의 규칙에 부합하는지 확인
            if (!containsThree(i)) {
                count++; // 규칙에 부합하면 카운트 증가
                
                // n번째 숫자를 찾았다면 해당 숫자를 저장
                if (count == n) {
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    // 숫자가 3의 배수이거나 3을 포함하는지 확인하는 메서드
    private boolean containsThree(int num) {
        // 3의 배수인 경우
        if (num % 3 == 0) {
            return true;
        }
        
        // 숫자에 3이 포함되어 있는지 확인
        while (num > 0) {
            if (num % 10 == 3) {
                return true;
            }
            num /= 10;
        }
        
        return false;
    }
}