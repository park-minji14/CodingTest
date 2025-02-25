class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 행 개수
        int rows = arr1.length;
        // arr2의 열 개수
        int columns = arr2[0].length;
        // arr1의 열 개수 (= arr2의 행 개수)
        int commonDimension = arr1[0].length;
        
        // 결과 행렬 초기화 (arr1의 행 X arr2의 열 크기로)
        int[][] answer = new int[rows][columns];
        
        // 행렬 곱셈 수행
        for (int i = 0; i < rows; i++) {            // arr1의 행을 순회
            for (int j = 0; j < columns; j++) {     // arr2의 열을 순회
                int sum = 0;
                for (int k = 0; k < commonDimension; k++) {  // 행렬 곱셈을 위한 내적 계산
                    // arr1의 i행 k열과 arr2의 k행 j열 원소를 곱해서 더함
                    sum += arr1[i][k] * arr2[k][j];
                }
                // 계산된 값을 결과 행렬에 저장
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
}