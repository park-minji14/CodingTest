class Solution {
    public int solution(int[] num_list) {
        // 배열을 순회하면서 첫 번째 음수의 인덱스를 찾습니다
        for(int i = 0; i < num_list.length; i++) {
            // 현재 숫자가 0보다 작으면 (음수이면)
            if(num_list[i] < 0) {
                // 해당 인덱스를 반환
                return i;
            }
        }
        
        // 음수를 찾지 못한 경우 -1을 반환
        return -1;
    }
}