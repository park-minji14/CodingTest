import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // 중복을 제거하기 위한 HashSet 선언
        HashSet<Integer> sumSet = new HashSet<>();
        
        // 원형 수열이므로 배열의 길이의 2배만큼 확장
        int[] extendedArr = new int[elements.length * 2];
        
        // 배열 확장 (원형 처리를 위해)
        for(int i = 0; i < elements.length * 2; i++) {
            extendedArr[i] = elements[i % elements.length];
        }
        
        // 연속 부분 수열의 길이를 1부터 elements 길이까지 순회
        for(int i = 1; i <= elements.length; i++) {
            // 각 시작 위치에서
            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                // i길이 만큼의 연속 부분 수열의 합을 구함
                for(int k = 0; k < i; k++) {
                    sum += extendedArr[j + k];
                }
                // 구한 합을 HashSet에 추가 (중복은 자동으로 제거됨)
                sumSet.add(sum);
            }
        }
        
        // HashSet의 크기가 곧 서로 다른 부분 수열의 합의 개수
        return sumSet.size();
    }
}