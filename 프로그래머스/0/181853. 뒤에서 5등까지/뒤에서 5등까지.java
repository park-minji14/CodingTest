import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // num_list 배열을 복사하여 새로운 배열 sortedList를 만듭니다.
        int[] sortedList = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            sortedList[i] = num_list[i];
        }
        
        // sortedList 배열을 오름차순으로 정렬합니다.
        Arrays.sort(sortedList);
        
        // 정렬된 sortedList 배열의 처음 5개 요소를 새로운 배열 answer에 담아 반환합니다.
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            answer[i] = sortedList[i];
        }
        
        return answer;
    }
}