import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        // 사람들의 몸무게를 오름차순으로 정렬
        Arrays.sort(people);
        
        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스
        int boats = 0; // 필요한 보트의 개수
        
        while (left <= right) { // 모든 사람이 구출될 때까지 반복
            // 가장 가벼운 사람과 가장 무거운 사람의 합이 무게 제한을 넘지 않는다면 같이 태운다.
            if (people[left] + people[right] <= limit) {
                left++; // 가벼운 사람을 태웠으므로 다음으로 이동
            }
            // 무거운 사람은 항상 태워야 하므로 인덱스 감소
            right--;
            
            // 보트 한 대 추가
            boats++;
        }
        
        return boats;
    }
}