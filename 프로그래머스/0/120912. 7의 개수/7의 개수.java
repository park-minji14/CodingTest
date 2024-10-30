class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 배열의 각 숫자를 순회
        for (int num : array) {
            // 숫자를 문자열로 변환
            String numStr = String.valueOf(num);
            
            // 문자열의 각 자리수를 확인하여 7의 개수를 셈
            for (char digit : numStr.toCharArray()) {
                if (digit == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}