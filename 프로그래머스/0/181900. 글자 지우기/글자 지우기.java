import java.util.Arrays;

class Solution {
    /**
     * 문자열에서 주어진 인덱스들의 문자를 제외한 새로운 문자열을 반환하는 메소드
     * @param my_string 입력 문자열
     * @param indices 제외할 문자들의 인덱스 배열
     * @return 선택된 인덱스의 문자들을 제외한 새로운 문자열
     */
    public String solution(String my_string, int[] indices) {
        // 문자열을 StringBuilder로 변환
        StringBuilder result = new StringBuilder(my_string);
        
        // indices 배열을 정렬 (뒤에서부터 제거하기 위해)
        Arrays.sort(indices);
        
        // 뒤에서부터 문자 제거 (앞에서부터 제거하면 인덱스가 변경됨)
        for (int i = indices.length - 1; i >= 0; i--) {
            result.deleteCharAt(indices[i]);
        }
        
        return result.toString();
    }
}