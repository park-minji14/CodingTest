class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        
        // 문자열의 각 문자를 순회
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 공백이면 그대로 추가하고 인덱스 초기화
            if(c == ' ') {
                answer += c;
                idx = 0;
                continue;
            }
            
            // 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환
            answer += (idx % 2 == 0) ? 
                     Character.toUpperCase(c) : 
                     Character.toLowerCase(c);
            idx++;
        }
        
        return answer;
    }
}