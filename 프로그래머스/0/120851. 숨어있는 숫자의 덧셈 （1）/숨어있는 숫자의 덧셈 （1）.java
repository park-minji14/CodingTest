class Solution {
    public int solution(String my_string) {
        //: 문자열을 한 글자씩 확인하면서 숫자인 경우 더하기
        int answer = 0;
        
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                answer += (c - '0');
            }
        }
         return answer;
    }
}