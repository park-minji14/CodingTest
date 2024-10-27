class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // 두 배열을 비교하여 같은 원소의 개수를 셈
        for(String str1 : s1) {
            for(String str2 : s2) {
                if(str1.equals(str2)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}