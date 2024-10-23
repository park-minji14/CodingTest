class Solution {
    public String solution(String my_string) {
        // 각 모음을 빈 문자열로 replace
        String answer = my_string;
        answer = answer.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }
}