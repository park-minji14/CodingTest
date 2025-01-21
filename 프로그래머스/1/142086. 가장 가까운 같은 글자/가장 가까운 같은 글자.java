class Solution {
    public int[] solution(String s) {
        // 입력된 문자열 길이만큼의 결과 배열 생성
        int[] answer = new int[s.length()];
        
        // 각 위치별로 가장 가까운 동일 문자와의 거리 계산
        for (int i = 0; i < s.length(); i++) {
            // 기본값을 -1로 설정 (동일 문자를 찾지 못한 경우)
            answer[i] = -1;
            
            // 현재 위치(i)보다 앞에 있는 문자들을 검사
            for (int j = i - 1; j >= 0; j--) {
                // 동일한 문자를 찾으면
                if (s.charAt(i) == s.charAt(j)) {
                    // 현재 위치와의 거리를 계산하여 저장
                    answer[i] = i - j;
                    // 가장 가까운 문자를 찾았으므로 더 이상 검사할 필요 없음
                    break;
                }
            }
        }
        
        return answer;
    }
}