class Solution {
    public int[] solution(int n, String[] words) {
        // 결과를 저장할 배열 선언
        int[] answer = new int[2];
        
        // 이미 사용된 단어를 저장할 HashSet 생성
        java.util.HashSet<String> usedWords = new java.util.HashSet<>();
        
        // 첫 번째 단어 추가
        usedWords.add(words[0]);
        
        // 두 번째 단어부터 검사 시작
        for (int i = 1; i < words.length; i++) {
            // 현재 단어와 이전 단어
            String currentWord = words[i];
            String previousWord = words[i-1];
            
            // 탈락 조건 1: 이전 단어의 마지막 문자와 현재 단어의 첫 문자가 다른 경우
            // 탈락 조건 2: 이미 사용된 단어를 말한 경우
            if (previousWord.charAt(previousWord.length()-1) != currentWord.charAt(0) || 
                usedWords.contains(currentWord)) {
                
                // 탈락자 번호 계산 (나머지 연산 사용, +1은 1번부터 시작하기 때문)
                int playerNumber = (i % n) + 1;
                
                // 탈락자의 차례 계산 (몫 연산 사용, +1은 첫 번째 차례부터 시작하기 때문)
                int turn = (i / n) + 1;
                
                // 결과 저장
                answer[0] = playerNumber;
                answer[1] = turn;
                
                return answer;
            }
            
            // 사용된 단어 추가
            usedWords.add(currentWord);
        }
        
        // 탈락자가 없는 경우 [0, 0] 반환
        return new int[] {0, 0};
    }
}