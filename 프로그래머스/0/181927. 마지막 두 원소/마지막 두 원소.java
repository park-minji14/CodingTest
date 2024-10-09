class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        
        // 기존 num_list의 모든 요소를 answer 배열로 복사
        System.arraycopy(num_list, 0, answer, 0, length);
        
        // 마지막 원소와 그 전 원소 비교
        if (num_list[length - 1] > num_list[length - 2]) {
            answer[length] = num_list[length - 1] - num_list[length - 2];
        } else {
            answer[length] = num_list[length - 1] * 2;
        }
        
        return answer;
    }
}