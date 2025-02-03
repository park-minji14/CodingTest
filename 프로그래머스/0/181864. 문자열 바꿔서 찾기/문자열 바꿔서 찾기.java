class Solution {
    public int solution(String myString, String pat) {
        // 문자열 변환을 위한 StringBuilder 생성
        StringBuilder converted = new StringBuilder();
        
        // myString의 각 문자를 순회하면서 A는 B로, B는 A로 변환
        for(char c : myString.toCharArray()) {
            if(c == 'A') {
                converted.append('B');
            } else {
                converted.append('A');
            }
        }
        
        // 변환된 문자열에 pat이 포함되어 있는지 확인
        // contains()는 부분 문자열이 존재하면 true, 없으면 false를 반환
        return converted.toString().contains(pat) ? 1 : 0;
    }
}