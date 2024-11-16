class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        
        // 문자열의 모든 가능한 시작 위치에서 패턴 검사
        for(int i = 0; i <= myString.length() - pat.length(); i++) {
            // 현재 위치에서 패턴의 길이만큼 추출한 부분 문자열
            String subStr = myString.substring(i, i + pat.length());
            
            // 추출한 부분 문자열이 패턴과 일치하면 카운트 증가
            if(subStr.equals(pat)) {
                count++;
            }
        }
        
        return count;
    }
}