import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 문자열을 모두 소문자로 변환
        String lowercaseString = my_string.toLowerCase();
        
        // 2. 소문자로 변환된 문자열을 char 배열로 변환
        char[] charArray = lowercaseString.toCharArray();
        
        // 3. char 배열을 알파벳 순으로 정렬
        Arrays.sort(charArray);
        
        // 4. 정렬된 char 배열을 다시 문자열로 변환
        return new String(charArray);
    }
}