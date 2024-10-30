class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 배열을 순회하면서 height보다 큰 값의 개수를 센다
        for (int personHeight : array) {
            if (personHeight > height) {
                answer++;
            }
        }
        
        return answer;
    }
}