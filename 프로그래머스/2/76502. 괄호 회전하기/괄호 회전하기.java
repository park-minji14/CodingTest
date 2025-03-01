class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        // 문자열을 0부터 len-1까지 회전시키며 확인
        for (int i = 0; i < len; i++) {
            // 문자열 회전: 왼쪽으로 i칸 회전
            String rotated = s.substring(i) + s.substring(0, i);
            
            // 회전된 문자열이 올바른 괄호 문자열인지 확인
            if (isValid(rotated)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 올바른 괄호 문자열인지 확인하는 메소드
    private boolean isValid(String s) {
        // 스택을 사용하여 괄호 검사
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 여는 괄호인 경우 스택에 추가
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // 닫는 괄호인 경우
            else {
                // 스택이 비어있으면 짝이 맞지 않음
                if (stack.isEmpty()) {
                    return false;
                }
                
                // 스택의 맨 위 괄호와 현재 괄호가 짝이 맞는지 확인
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // 모든 검사 후 스택이 비어있어야 올바른 괄호 문자열
        return stack.isEmpty();
    }
}