class Solution {
    public int solution(int[] num_list, int n) {
        // 리스트 num_list에서 n이 발견되면 1을, 발견되지 않으면 0을 반환합니다.
        int answer = 0;
        for (int num : num_list) {
            if (num == n) {
                answer = 1;
                break; // n이 발견되면 더 이상 반복할 필요 없으므로 반복문을 종료합니다.
            }
        }
        return answer;
    }
}