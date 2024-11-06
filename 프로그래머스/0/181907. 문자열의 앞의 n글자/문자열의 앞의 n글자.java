class Solution {
    public String solution(String my_string, int n) {
        // 문자열의 앞에서부터 n개의 문자를 잘라내기 위해 substring 메소드 사용
        // substring(시작 인덱스, 끝 인덱스)에서 시작 인덱스는 0, 끝 인덱스는 n
        String answer = my_string.substring(0, n);
        return answer;
    }
}