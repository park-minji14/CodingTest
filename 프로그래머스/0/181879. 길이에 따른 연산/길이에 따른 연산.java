class Solution {
    public int solution(int[] num_list) {
        // 배열의 길이 확인
        int length = num_list.length;
        int answer = 0;
        
        if (length >= 11) {
            // 길이가 11 이상이면 모든 원소의 합을 계산
            for (int num : num_list) {
                answer += num;
            }
        } else {
            // 길이가 10 이하면 모든 원소의 곱을 계산
            answer = 1; // 곱셈을 위해 1로 초기화
            for (int num : num_list) {
                answer *= num;
            }
        }
        
        return answer;
    }
}