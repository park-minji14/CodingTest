class Solution {
    public String solution(String my_string, int s, int e) {
        // 1. 문자열을 문자 배열로 변환하여 수정 가능하게 만듦
        char[] chars = my_string.toCharArray();
        
        // 2. s부터 e까지의 문자들을 뒤집음
        // 양끝에서부터 중앙으로 이동하면서 문자를 교환
        while (s < e) {
            // 양끝 문자를 교환
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            
            // 인덱스를 중앙으로 이동
            s++;
            e--;
        }
        
        // 3. 문자 배열을 다시 문자열로 변환하여 반환
        return new String(chars);
    }
}