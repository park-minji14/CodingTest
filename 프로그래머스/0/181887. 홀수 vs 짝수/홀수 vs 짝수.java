class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        
        // 홀수 번째 원소들의 합 구하기
        for (int i = 0; i < num_list.length; i += 2) {
            oddSum += num_list[i];
        }
        
        // 짝수 번째 원소들의 합 구하기
        for (int i = 1; i < num_list.length; i += 2) {
            evenSum += num_list[i];
        }
        
        // 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 더 큰 값을 return
        if (oddSum > evenSum) {
            answer = oddSum;
        } else {
            answer = evenSum;
        }
        
        return answer;
    }
}