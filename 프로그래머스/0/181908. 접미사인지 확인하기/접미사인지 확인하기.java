class Solution {
    public int solution(String my_string, String is_suffix) {
        // 접미사 길이가 원본 문자열보다 길면 접미사가 될 수 없음
        if (is_suffix.length() > my_string.length()) {
            return 0;
        }
        
        // 원본 문자열의 뒷부분과 접미사 후보를 비교
        String actualSuffix = my_string.substring(my_string.length() - is_suffix.length());
        
        // 일치하면 1, 아니면 0을 반환
        return actualSuffix.equals(is_suffix) ? 1 : 0;
    }
}