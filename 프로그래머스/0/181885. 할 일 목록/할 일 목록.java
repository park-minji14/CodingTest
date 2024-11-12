import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 미완료된 할일을 저장할 ArrayList 생성
        ArrayList<String> result = new ArrayList<>();
        
        // todo_list와 finished 배열을 동시에 순회
        for (int i = 0; i < todo_list.length; i++) {
            // finished가 false인 경우(미완료된 할일)만 결과 리스트에 추가
            if (!finished[i]) {
                result.add(todo_list[i]);
            }
        }
        
        // ArrayList를 String 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}