class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        // my_string에 target이 포함되어 있는지 확인
        if (my_string.contains(target)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}