class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        // 배열을 순회하면서 n과 같은 숫자의 개수를 센다
        for (int num : array) {
            if (num == n) {
                answer++;
            }
        }
        
        return answer;
    }
}