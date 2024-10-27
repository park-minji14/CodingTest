class Solution {
    public int[] solution(int[] array) {
        int maxNumber = array[0];  // 가장 큰 수를 저장할 변수
        int maxIndex = 0;          // 가장 큰 수의 인덱스를 저장할 변수
        
        // 배열을 순회하면서 가장 큰 수와  인덱스를 찾음
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        
        // 가장 큰 수와 그 인덱스를 배열로 반환
        return new int[] {maxNumber, maxIndex};
    }
}