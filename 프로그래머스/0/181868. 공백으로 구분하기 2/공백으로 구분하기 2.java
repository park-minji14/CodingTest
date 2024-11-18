class Solution {
    public String[] solution(String my_string) {
        // 문자열을 공백으로 분리하여 단어 배열 생성
        String[] words = my_string.trim().split("\\s+");
        
        return words;
    }
}