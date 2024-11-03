class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        
        // 각 자릿수별 계산을 위한 인덱스
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        // 올림수(carry) 저장
        int carry = 0;
        
        // 두 이진수를 모두 처리할 때까지 반복
        while (i >= 0 || j >= 0 || carry > 0) {
            // 현재 자릿수의 합 계산
            int sum = carry;
            
            // bin1의 현재 자릿수 처리
            if (i >= 0) {
                sum += bin1.charAt(i) - '0';
                i--;
            }
            
            // bin2의 현재 자릿수 처리
            if (j >= 0) {
                sum += bin2.charAt(j) - '0';
                j--;
            }
            
            // 현재 자릿수의 결과값 추가 (0 또는 1)
            result.insert(0, sum % 2);
            // 다음 자릿수로 넘어갈 올림수 계산
            carry = sum / 2;
        }
        
        return result.toString();
    }
}