import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 스트림으로 변환하고 역순으로 정렬
        return s.chars()
                .mapToObj(ch -> String.valueOf((char)ch))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}