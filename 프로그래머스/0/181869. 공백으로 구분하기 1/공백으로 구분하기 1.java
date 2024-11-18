class Solution {
    public String[] solution(String my_string) {
        // 문자열을 공백(" ")을 기준으로 분리하여 배열로 반환
        // split() 메서드는 정규식을 인자로 받아 문자열을 분할함
        return my_string.split(" ");
    }
}