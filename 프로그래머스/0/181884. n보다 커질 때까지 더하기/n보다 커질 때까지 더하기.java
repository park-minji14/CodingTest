class Solution {
    public int solution(int[] numbers, int n) {
        // 현재까지의 합을 저장할 변수
        int sum = 0;
        
        // 배열을 순회하면서 합을 계산
        for (int num : numbers) {
            // 현재 합이 n보다 커졌다면 반복 중단
            if (sum > n) {
                break;
            }
            // 현재 숫자를 합에 추가
            sum += num;
        }
        
        return sum;
    }
}