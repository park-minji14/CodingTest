class Solution {
    boolean solution(String s) {
        // 여는 괄호의 개수를 카운트할 변수
        int count = 0;
        
        // 문자열의 각 문자를 순회
        for (char c : s.toCharArray()) {
            // 여는 괄호일 경우 카운트 증가
            if (c == '(') {
                count++;
            } 
            // 닫는 괄호일 경우
            else {
                // 남은 여는 괄호가 없는데 닫는 괄호가 나오면 잘못된 경우
                if (count == 0) {
                    return false;
                }
                // 정상적인 경우 여는 괄호 하나 소비
                count--;
            }
        }
        
        // 모든 괄호가 올바르게 짝지어졌다면 count는 0이어야 함
        return count == 0;
    }
}