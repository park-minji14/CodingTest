class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        // 문자열 num_str을 순회하며 각 문자를 정수로 변환하여 더함
        for (int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(num_str.charAt(i));
        }
        
        return answer;
    }
}