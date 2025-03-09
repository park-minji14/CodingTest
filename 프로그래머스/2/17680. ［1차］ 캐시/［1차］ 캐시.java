import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 총 실행시간
        int answer = 0;
        
        // 캐시 크기가 0인 경우 모두 cache miss이므로 도시 개수 * 5 반환
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        // LRU 캐시를 LinkedList로 구현
        LinkedList<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            // 대소문자 구분 없음 - 모두 소문자로 통일
            String lowerCity = city.toLowerCase();
            
            // 캐시에 도시가 있는 경우 (cache hit)
            if (cache.remove(lowerCity)) {
                // 최근 사용되었으므로 맨 앞으로 이동
                cache.addFirst(lowerCity);
                answer += 1; // cache hit은 실행시간 1
            } 
            // 캐시에 도시가 없는 경우 (cache miss)
            else {
                // 캐시가 가득 찬 경우 가장 오래된 항목(맨 뒤) 제거
                if (cache.size() >= cacheSize) {
                    cache.pollLast();
                }
                // 새 도시를 캐시의 맨 앞에 추가
                cache.addFirst(lowerCity);
                answer += 5; // cache miss는 실행시간 5
            }
        }
        
        return answer;
    }
}