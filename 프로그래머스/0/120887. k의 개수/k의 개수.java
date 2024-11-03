class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        // i부터 j까지 순회
        for (int num = i; num <= j; num++) {
            // 현재 숫자를 문자열로 변환
            String numStr = String.valueOf(num);
            
            // 각 자리수를 확인하며 k 카운트
            for (char c : numStr.toCharArray()) {
                if (c - '0' == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}