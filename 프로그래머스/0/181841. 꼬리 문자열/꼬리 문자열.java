class Solution {
    public String solution(String[] str_list, String ex) {
        // 빈 문자열로 초기화
        String answer = "";

        // str_list 배열에 있는 각 문자열을 확인
        for (String str : str_list) {
            // 해당 문자열에 ex 문자열이 포함되어 있지 않은 경우
            if (!str.contains(ex)) {
                // answer 에 연결
                answer += str;
            }
        }

        return answer;
    }
}