class Solution {
    public int solution(String my_string) {
        // 공백을 제거하고 문자열을 분리
        String[] parts = my_string.split(" ");
        
        // 첫 번째 숫자를 정수로 변환
        int answer = Integer.parseInt(parts[0]);
        
        // 연산자에 따라 계산
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int num = Integer.parseInt(parts[i + 1]);
            
            if (operator.equals("+")) {
                answer += num;
            } else if (operator.equals("-")) {
                answer -= num;
            }
        }
        
        return answer;
    }
}