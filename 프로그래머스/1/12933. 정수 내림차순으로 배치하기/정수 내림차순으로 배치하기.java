import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환
        String str = String.valueOf(n);
        
        // 문자열을 문자 배열로 변환
        char[] chars = str.toCharArray();
        
        // 내림차순으로 정렬
        Arrays.sort(chars);
        
        // 문자 배열 뒤집기 (오름차순 -> 내림차순)
        for(int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        
        // 정렬된 문자열을 다시 숫자로 변환
        return Long.parseLong(new String(chars));
    }
}