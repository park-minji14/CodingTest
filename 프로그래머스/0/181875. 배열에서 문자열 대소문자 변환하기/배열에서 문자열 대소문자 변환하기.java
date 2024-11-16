class Solution {
    public String[] solution(String[] strArr) {
        // 결과를 저장할 배열 생성 (입력 배열과 같은 길이)
        String[] answer = new String[strArr.length];
        
        // 배열의 각 요소를 순회
        for(int i = 0; i < strArr.length; i++) {
            // 짝수 인덱스인 경우 (i % 2 == 0)
            if(i % 2 == 0) {
                // 문자열을 소문자로 변환
                answer[i] = strArr[i].toLowerCase();
            }
            // 홀수 인덱스인 경우
            else {
                // 문자열을 대문자로 변환
                answer[i] = strArr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}