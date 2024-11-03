class Solution {
    public int solution(String before, String after) {
        // 문자열 길이가 다르면 불가능
        if (before.length() != after.length()) {
            return 0;
        }
        
        // 각 문자의 출현 횟수를 저장할 배열
        int[] chars = new int[26];
        
        // before 문자열의 각 문자 카운트 증가
        for (char c : before.toCharArray()) {
            chars[c - 'a']++;
        }
        
        // after 문자열의 각 문자 카운트 감소
        for (char c : after.toCharArray()) {
            chars[c - 'a']--;
        }
        
        // 모든 문자의 카운트가 0이면 가능
        for (int count : chars) {
            if (count != 0) {
                return 0;
            }
        }
        
        return 1;
    }
}