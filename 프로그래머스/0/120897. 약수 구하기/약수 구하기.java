class Solution {
    public int[] solution(int n) {
        // 약수의 개수를 먼저 계산
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        // 결과 배열 생성
        int[] result = new int[count];
        
        // 약수를 찾아서 배열에 저장
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[index++] = i;
            }
        }
        
        return result;
    }
}