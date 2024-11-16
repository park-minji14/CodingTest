class Solution {
    public String solution(String myString) {
        // 결과를 저장할 StringBuilder 생성 (문자열 조작에 효율적)
        StringBuilder answer = new StringBuilder();
        
        // 문자열을 한 글자씩 순회
        for(int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            // 현재 문자가 'a'이거나 'A'인 경우
            if(currentChar == 'a' || currentChar == 'A') {
                // 무조건 대문자 'A'로 변환
                answer.append('A');
            }
            // 'a'가 아닌 문자의 경우
            else {
                // 소문자로 변환
                answer.append(Character.toLowerCase(currentChar));
            }
        }
        
        return answer.toString();
    }
}