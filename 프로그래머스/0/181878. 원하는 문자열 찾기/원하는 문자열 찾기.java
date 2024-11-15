class Solution {
    public int solution(String myString, String pat) {
        // 대소문자 구분하지 않기 위해 모두 소문자로 변환
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        // pat의 길이가 더 길면 부분 문자열이 존재할 수 없음
        if (myString.length() < pat.length()) {
            return 0;
        }
        
        // 부분 문자열 존재 여부 확인
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            // 현재 위치에서 pat 길이만큼의 부분 문자열 추출
            String subStr = myString.substring(i, i + pat.length());
            // 패턴과 일치하는지 확인
            if (subStr.equals(pat)) {
                return 1;
            }
        }
        
        return 0;
    }
}