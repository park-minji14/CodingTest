class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        // 각 문자열과 해당하는 parts 배열을 순회
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int start = parts[i][0];  // 시작 인덱스
            int end = parts[i][1];    // 끝 인덱스
            
            // substring을 이용해 부분 문자열 추출하고 연결
            // end + 1을 해주는 이유는 substring이 끝 인덱스를 포함하지 않기 때문임
            answer.append(str.substring(start, end + 1));
        }
        
        return answer.toString();
    }
}