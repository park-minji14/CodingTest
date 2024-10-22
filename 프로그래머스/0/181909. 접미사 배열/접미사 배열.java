class Solution {
    public String[] solution(String my_string) {
        // 문자열 길이만큼의 배열 생성
        String[] answer = new String[my_string.length()];
        
        // 모든 가능한 접미사 생성
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        
        // 사전순으로 정렬
        java.util.Arrays.sort(answer);
        
        return answer;
    }
}