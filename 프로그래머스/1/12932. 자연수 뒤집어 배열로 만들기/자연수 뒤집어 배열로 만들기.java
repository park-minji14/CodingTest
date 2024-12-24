class Solution {
    public int[] solution(long n) {
        // 숫자를 문자열로 변환
        String str = String.valueOf(n);
        int len = str.length();
        int[] answer = new int[len];
        
        // 뒤에서부터 배열에 넣기
        for(int i = 0; i < len; i++) {
            answer[i] = str.charAt(len-1-i) - '0';
        }
        
        return answer;
    }
}