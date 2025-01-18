class Solution {
    public boolean solution(String s) {
        // 길이가 4 또는 6이 아니면 false 반환
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 문자열의 각 문자를 확인
        for (char c : s.toCharArray()) {
            // 숫자가 아닌 문자가 있으면 false 반환
            if (c < '0' || c > '9') {
                return false;
            }
        }
        
        // 모든 검사를 통과하면 true 반환
        return true;
    }
}