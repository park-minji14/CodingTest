class Solution {
    public int solution(String[] babbling) {
        // 발음 가능한 단어 수를 저장할 변수
        int answer = 0;
        
        // 아기가 발음할 수 있는 기본 발음들
        String[] basicWords = {"aya", "ye", "woo", "ma"};
        
        // 각 단어 확인
        for(String word : babbling) {
            // 현재 단어가 발음 가능한지 체크
            boolean canSpeak = true;
            // 이전에 사용한 발음을 저장
            String prevSound = "";
            
            // 단어를 처음부터 확인
            while(word.length() > 0 && canSpeak) {
                boolean foundMatch = false;
                
                // 각 기본 발음에 대해 확인
                for(String basic : basicWords) {
                    // 단어가 현재 기본 발음으로 시작하고, 같은 발음이 연속되지 않는 경우
                    if(word.startsWith(basic) && !basic.equals(prevSound)) {
                        // 해당 발음 부분을 제거하고 계속 진행
                        word = word.substring(basic.length());
                        prevSound = basic;
                        foundMatch = true;
                        break;
                    }
                }
                
                // 매칭되는 발음을 찾지 못한 경우
                if(!foundMatch) {
                    canSpeak = false;
                }
            }
            
            // 단어를 끝까지 처리했고 발음 가능한 경우
            if(word.length() == 0 && canSpeak) {
                answer++;
            }
        }
        
        return answer;
    }
}