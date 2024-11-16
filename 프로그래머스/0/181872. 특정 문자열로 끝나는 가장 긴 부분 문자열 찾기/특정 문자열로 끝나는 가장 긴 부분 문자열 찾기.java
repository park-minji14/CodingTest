class Solution {
    public String solution(String myString, String pat) {
        // 문자열의 뒤에서부터 패턴을 찾기 위해 lastIndexOf 사용
        int lastIndex = myString.lastIndexOf(pat);
        
        // 패턴이 발견되지 않은 경우
        if(lastIndex == -1) {
            return "";
        }
        
        // 패턴의 끝까지 포함하여 문자열 자르기
        // lastIndex + pat.length()로 패턴의 끝까지 포함
        return myString.substring(0, lastIndex + pat.length());
    }
}