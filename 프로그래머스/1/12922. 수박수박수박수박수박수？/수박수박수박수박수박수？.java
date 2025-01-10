class Solution {
    public String solution(int n) {
        // 결과 문자열을 저장할 char 배열 생성
        char[] answer = new char[n];
        
        // n번 반복하면서 짝수 인덱스에는 '수', 홀수 인덱스에는 '박'을 저장
        for (int i = 0; i < n; i++) {
            // 삼항 연산자를 사용하여 짝수/홀수 인덱스에 따라 다른 문자 할당
            answer[i] = (i % 2 == 0) ? '수' : '박';
        }
        
        // char 배열을 String으로 변환하여 반환
        return String.valueOf(answer);
    }
}