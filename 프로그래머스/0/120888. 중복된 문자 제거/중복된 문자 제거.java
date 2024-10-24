class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        boolean[] seen = new boolean[128];  // ASCII 문자를 체크하기 위한 배열
        
        for (char c : my_string.toCharArray()) {
            if (!seen[c]) {
                answer.append(c);
                seen[c] = true;
            }
        }
        
        return answer.toString();
    }
}