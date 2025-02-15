import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 각 크기별 귤의 개수를 저장할 HashMap 생성
        Map<Integer, Integer> sizeCount = new HashMap<>();
        
        // 각 크기별로 귤의 개수를 카운트
        for (int size : tangerine) {
            sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
        }
        
        // 귤 개수를 기준으로 내림차순 정렬하여 List로 변환
        List<Integer> counts = new ArrayList<>(sizeCount.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        int total = 0;  // 선택한 귤의 개수
        int types = 0;  // 선택한 귤의 종류 수
        
        // 필요한 개수(k)를 채울 때까지 가장 많은 개수의 귤부터 선택
        for (int count : counts) {
            total += count;
            types++;
            
            if (total >= k) {
                break;
            }
        }
        
        return types;
    }
}