class Solution {
    public boolean solution(String s) {
        // 문자열을 소문자로 변환
        s = s.toLowerCase();
        
        int pCount = 0;
        int yCount = 0;
        
        // 문자열을 순회하면서 p와 y 개수 세기
        for(char c : s.toCharArray()) {
            if(c == 'p') {
                pCount++;
            } else if(c == 'y') {
                yCount++;
            }
        }
        
        // p와 y의 개수가 같으면 true, 다르면 false
        return pCount == yCount;
    }
}