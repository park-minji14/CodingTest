import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        // 결과를 저장할 리스트 생성
        List<String> result = new ArrayList<>();
        
        // 5명씩 그룹을 나누어 첫 번째 사람 선택
        for (int i = 0; i < names.length; i += 5) {
            // 각 그룹의 첫 번째 사람을 결과 리스트에 추가
            result.add(names[i]);
        }
        
        // 리스트를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}