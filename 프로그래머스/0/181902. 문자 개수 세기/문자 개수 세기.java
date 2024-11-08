class Solution {
    /**
     * 문자열에서 각 알파벳의 개수를 세어 배열로 반환하는 메소드
     * @param my_string 입력 문자열
     * @return 알파벳 개수를 담은 길이 52의 정수 배열 (0-25: 대문자, 26-51: 소문자)
     */
    public int[] solution(String my_string) {
        // 알파벳 대소문자 개수를 저장할 배열 (0-25: 대문자, 26-51: 소문자)
        int[] answer = new int[52];
        
        // 문자열의 각 문자를 순회
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 대문자인 경우 (A=65를 빼서 0-25 인덱스에 저장)
                answer[c - 'A']++;
            } else if (Character.isLowerCase(c)) {
                // 소문자인 경우 (a=97를 빼서 26-51 인덱스에 저장)
                answer[c - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}