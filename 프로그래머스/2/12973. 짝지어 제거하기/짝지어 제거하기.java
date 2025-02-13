class Solution {
    public int solution(String s) {
        // 문자를 담을 스택 생성
        char[] stack = new char[s.length()];
        int stackSize = 0;
        
        // 문자열을 순회하면서 스택에 쌓기
        for (char c : s.toCharArray()) {
            // 스택이 비어있지 않고, 스택의 top이 현재 문자와 같으면 제거
            if (stackSize > 0 && stack[stackSize - 1] == c) {
                stackSize--;
            }
            // 그렇지 않으면 스택에 현재 문자 추가
            else {
                stack[stackSize] = c;
                stackSize++;
            }
        }
        
        // 스택이 비어있으면 모든 문자를 제거한 것
        return stackSize == 0 ? 1 : 0;
    }
}