class Solution {
    public String solution(String s) {
        // 각 문자의 등장 횟수를 저장할 배열 (a-z: 26개)
        int[] charCount = new int[26];
        
        // 각 문자의 등장 횟수 계산
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // 한 번만 등장하는 문자들을 StringBuilder에 추가
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == 1) {
                result.append((char)(i + 'a'));
            }
        }
        
        // 결과 반환 (이미 사전순으로 정렬되어 있음)
        return result.toString();
    }
}