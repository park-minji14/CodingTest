import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        // 다중집합을 저장할 리스트
        List<String> set1 = getMultiSet(str1);
        List<String> set2 = getMultiSet(str2);
        
        // 교집합과 합집합을 계산하기 위해 Counter 역할을 하는 Map 사용
        Map<String, Integer> map1 = getFrequencyMap(set1);
        Map<String, Integer> map2 = getFrequencyMap(set2);
        
        // 교집합과 합집합 크기 계산
        int intersectionSize = 0;
        int unionSize = 0;
        
        // 합집합을 구하기 위한 키 셋 생성
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());
        
        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            
            intersectionSize += Math.min(count1, count2); // 교집합은 최소값
            unionSize += Math.max(count1, count2); // 합집합은 최대값
        }
        
        // 자카드 유사도 계산 (둘 다 공집합인 경우 1로 처리)
        double jaccardSimilarity = (unionSize == 0) ? 1 : (double) intersectionSize / unionSize;
        
        // 65536을 곱하고 소수점 아래 제거하여 정수로 반환
        return (int) (jaccardSimilarity * 65536);
    }
    
    // 주어진 문자열을 두 글자씩 끊어 다중집합으로 변환하는 메서드
    private List<String> getMultiSet(String str) {
        List<String> multiSet = new ArrayList<>();
        str = str.toLowerCase(); // 대소문자 구분 없애기 위해 소문자로 변환
        
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            
            // 알파벳만 포함된 경우에만 추가
            if (Character.isLetter(first) && Character.isLetter(second)) {
                multiSet.add(first + "" + second);
            }
        }
        return multiSet;
    }
    
    // 리스트를 받아 원소별 빈도수를 저장하는 Map을 반환하는 메서드
    private Map<String, Integer> getFrequencyMap(List<String> multiSet) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String elem : multiSet) {
            freqMap.put(elem, freqMap.getOrDefault(elem, 0) + 1);
        }
        return freqMap;
    }
}