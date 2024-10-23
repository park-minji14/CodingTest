import java.util.Arrays; 

class Solution {
    public int[] solution(String my_string) {
        // 정규식을 사용하여 숫자가 아닌 문자 제거 후 정렬
        String numbers = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[numbers.length()];
        
        for(int i = 0; i < numbers.length(); i++) {
            answer[i] = numbers.charAt(i) - '0';
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}