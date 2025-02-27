import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        // 의상 종류별 개수를 저장할 HashMap 생성
        Map<String, Integer> clothesMap = new HashMap<>();
        
        // 의상 종류별로 개수 카운트
        for (String[] cloth : clothes) {
            String type = cloth[1]; // 의상의 종류
            // 해당 종류가 이미 맵에 있으면 개수 증가, 없으면 1로 초기화
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        
        // 모든 조합의 수 계산
        int answer = 1;
        
        // 각 의상 종류별로 (개수 + 1)을 곱함 (안 입는 경우 포함)
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }
        
        // 모든 의상을 입지 않는 경우 1가지를 빼줌
        return answer - 1;
    }
}