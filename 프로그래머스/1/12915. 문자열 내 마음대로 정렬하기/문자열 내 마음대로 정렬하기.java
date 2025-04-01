import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 문자열 배열을 정렬합니다.
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자를 기준으로 비교
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            
            // 만약 n번째 문자가 다르면 해당 문자 기준으로 정렬
            if (c1 != c2) {
                return Character.compare(c1, c2);
            }
            
            // n번째 문자가 같으면 사전순으로 정렬
            return s1.compareTo(s2);
        });
        
        return strings;
    }
}
