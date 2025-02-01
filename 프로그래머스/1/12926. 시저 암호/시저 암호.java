class Solution {
    public String solution(String s, int n) {
        // 결과값을 저장할 StringBuilder 선언
        StringBuilder answer = new StringBuilder();
        
        // 문자열의 각 문자를 순회
        for (char c : s.toCharArray()) {
            // 공백인 경우 그대로 공백 추가
            if (c == ' ') {
                answer.append(' ');
                continue;
            }
            
            // 문자의 시작점 설정 (소문자인지 대문자인지에 따라)
            char start = Character.isLowerCase(c) ? 'a' : 'A';
            
            // 현재 문자의 알파벳상 위치를 0-25 사이의 값으로 변환
            int currentPosition = c - start;
            
            // n만큼 이동하고 26으로 나눈 나머지를 구함 (알파벳 범위를 넘어가지 않도록)
            int newPosition = (currentPosition + n) % 26;
            
            // 새로운 위치의 문자를 추가
            answer.append((char)(start + newPosition));
        }
        
        return answer.toString();
    }
}