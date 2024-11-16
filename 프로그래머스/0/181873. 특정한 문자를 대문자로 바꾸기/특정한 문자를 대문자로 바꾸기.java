class Solution {
    public String solution(String my_string, String alp) {
        // 결과를 저장할 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        
        // 문자열을 한 글자씩 순회
        for(int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            
            // 현재 문자가 alp와 같은지 확인 (대소문자 구분)
            if(String.valueOf(currentChar).equals(alp)) {
                // alp와 같은 문자는 대문자로 변환
                answer.append(Character.toUpperCase(currentChar));
            } else {
                // 다른 문자는 그대로 유지
                answer.append(currentChar);
            }
        }
        
        return answer.toString();
    }
}