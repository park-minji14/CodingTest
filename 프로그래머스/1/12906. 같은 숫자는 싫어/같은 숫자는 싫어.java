import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        // ArrayList를 사용하여 동적으로 결과를 저장
        ArrayList<Integer> tempList = new ArrayList<>();
        
        // 첫 번째 원소는 무조건 포함
        tempList.add(arr[0]);
        
        // 배열을 순회하면서 연속된 중복 숫자 제거
        for (int i = 1; i < arr.length; i++) {
            // 현재 숫자가 이전 숫자와 다른 경우에만 추가
            if (arr[i] != arr[i-1]) {
                tempList.add(arr[i]);
            }
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}