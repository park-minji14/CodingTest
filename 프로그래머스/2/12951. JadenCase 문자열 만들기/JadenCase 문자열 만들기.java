class Solution {
    public String solution(String s) {
        // 결과를 저장할 StringBuilder 생성 (String보다 효율적인 문자열 처리를 위해)
        StringBuilder answer = new StringBuilder();
        
        // 첫 단어의 시작 여부를 체크하기 위한 플래그
        boolean isFirstChar = true;
        
        // 문자열의 각 문자를 순회
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == ' ') {
                // 공백문자인 경우: 다음 문자는 단어의 시작이 됨
                isFirstChar = true;
                answer.append(currentChar);
            } else {
                if (isFirstChar) {
                    // 단어의 첫 문자인 경우: 대문자로 변환
                    answer.append(Character.toUpperCase(currentChar));
                    isFirstChar = false;
                } else {
                    // 단어의 첫 문자가 아닌 경우: 소문자로 변환
                    answer.append(Character.toLowerCase(currentChar));
                }
            }
        }
        
        // StringBuilder를 String으로 변환하여 반환
        return answer.toString();
    }
}