class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for (char digit : ageStr.toCharArray()) {
            char alienChar = (char) ('a' + (digit - '0'));
            answer.append(alienChar);
        }
        
        return answer.toString();
    }
}