class Solution {
    public String solution(String my_string, int n) {
        // 문자열의 길이 구하기
        int length = my_string.length();
        
        // 문자열의 뒤에서 n개의 문자 추출
        return my_string.substring(length - n);
    }
}