class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        // 모든 단어를 순회하며 가능한 단어 조합 찾기
        for (String word : dic) {
            if (isValidCombination(spell, word)) {
                answer = 1;
                break;
            }
        }
        
        // 가능한 단어 조합이 없으면 2 반환
        if (answer == 0) {
            answer = 2;
        }
        
        return answer;
    }
    
    private boolean isValidCombination(String[] spell, String word) {
        boolean[] used = new boolean[spell.length];
        
        // 단어의 각 문자를 spell 배열의 문자와 대응시켜 확인
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < spell.length; j++) {
                if (!used[j] && spell[j].charAt(0) == c) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                return false;
            }
        }
        
        // spell 배열의 모든 문자가 사용되었다면 true 반환
        for (boolean b : used) {
            if (!b) {
                return false;
            }
        }
        
        return true;
    }
}