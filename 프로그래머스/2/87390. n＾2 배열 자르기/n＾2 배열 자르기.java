class Solution {
    public int[] solution(int n, long left, long right) {
        // 결과 배열의 크기 계산
        int arraySize = (int)(right - left + 1);
        int[] answer = new int[arraySize];
        
        // left부터 right까지의 인덱스에 해당하는 값을 계산하여 배열에 채우기
        for (int i = 0; i < arraySize; i++) {
            long currentIndex = left + i;
            
            // 2차원 배열에서의 행과 열 계산
            int row = (int)(currentIndex / n);
            int col = (int)(currentIndex % n);
            
            // 2차원 배열의 해당 위치의 값은 max(row, col) + 1
            // (해당 위치가 몇 번째 패턴에서 채워지는지 계산)
            answer[i] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}