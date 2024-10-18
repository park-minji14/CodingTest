import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 모스 부호 배열
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 모스 부호와 알파벳을 매핑하는 HashMap 생성
        Map<String, Character> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char)('a' + i));
        }
        
        StringBuilder answer = new StringBuilder();
        String[] letters = letter.split(" ");
        
        // 각 모스 부호를 해독하여 문자로 변환
        for (String code : letters) {
            answer.append(morseMap.get(code));
        }
        
        return answer.toString();
    }
}