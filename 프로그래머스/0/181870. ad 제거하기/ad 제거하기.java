import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        // 1. 결과를 저장할 ArrayList 생성
        ArrayList<String> resultList = new ArrayList<>();
        
        // 2. 배열의 각 문자열을 순회하면서 "ad"를 포함하지 않는 문자열만 선택
        for (String str : strArr) {
            // "ad"를 포함하지 않으면 결과 리스트에 추가
            if (!str.contains("ad")) {
                resultList.add(str);
            }
        }
        
        // 3. ArrayList를 배열로 변환하여 반환
        return resultList.toArray(new String[0]);
    }
}