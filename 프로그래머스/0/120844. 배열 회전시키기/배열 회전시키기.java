import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        
        // 오른쪽으로 회전
        if (direction.equals("right")) {
            // 마지막 요소를 임시 저장
            int temp = numbers[length - 1];
            
            // 모든 요소를 오른쪽으로 한 칸씩 이동
            for (int i = length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            
            // 첫 번째 위치에 임시 저장한 값 할당
            numbers[0] = temp;
        } 
        // 왼쪽으로 회전
        else {
            // 첫 번째 요소를 임시 저장
            int temp = numbers[0];
            
            // 모든 요소를 왼쪽으로 한 칸씩 이동
            for (int i = 0; i < length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            
            // 마지막 위치에 임시 저장한 값 할당
            numbers[length - 1] = temp;
        }
        
        // 회전된 배열 반환
        return numbers;
    }
}