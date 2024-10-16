import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        int[] sortedEmergency = Arrays.copyOf(emergency, n);
        
        // 응급도를 내림차순으로 정렬
        Arrays.sort(sortedEmergency);
        reverseArray(sortedEmergency);
        
        // 각 응급도의 순위를 매김
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (emergency[i] == sortedEmergency[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    // 배열을 뒤집는 helper 메소드
    private void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}