class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // 배열을 순회하면서
        for(int i = 0; i < absolutes.length; i++) {
            // true면 양수, false면 음수로 더하기
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}