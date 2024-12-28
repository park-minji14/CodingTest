import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // divisor로 나누어 떨어지는 수 찾기
        for(int num : arr) {
            if(num % divisor == 0) {
                list.add(num);
            }
        }
        
        // 나누어 떨어지는 수가 없는 경우
        if(list.isEmpty()) {
            return new int[]{-1};
        }
        
        // 리스트를 배열로 변환하고 정렬
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}