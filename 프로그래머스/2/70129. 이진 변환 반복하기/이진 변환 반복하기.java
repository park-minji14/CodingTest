class Solution {
    public int[] solution(String s) {
        // 결과를 저장할 변수들
        // transformCount: 이진 변환 횟수
        // removedZeros: 제거된 0의 총 개수
        int transformCount = 0;
        int removedZeros = 0;
        
        // s가 "1"이 될 때까지 반복
        while (!s.equals("1")) {
            // 현재 문자열의 길이 저장
            int currentLength = s.length();
            
            // 1. 모든 0 제거
            s = s.replace("0", "");
            
            // 제거된 0의 개수 계산하여 누적
            removedZeros += currentLength - s.length();
            
            // 2. 남은 1의 개수를 이진수로 변환
            s = Integer.toBinaryString(s.length());
            
            // 변환 횟수 증가
            transformCount++;
        }
        
        // [변환 횟수, 제거된 0의 개수] 반환
        return new int[]{transformCount, removedZeros};
    }
}