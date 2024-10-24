class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()) {
            // 대문자인 경우
            if(Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            }
            // 소문자인 경우
            else {
                answer.append(Character.toUpperCase(c));
            }
        }
        
        return answer.toString();
    }
}