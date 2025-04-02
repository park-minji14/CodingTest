import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; // 결과를 저장할 배열 (매일의 최하위 점수)
        ArrayList<Integer> hallOfFame = new ArrayList<>(); // 명예의 전당 리스트
        
        // 매일 가수의 점수를 처리
        for (int i = 0; i < score.length; i++) {
            // 현재 가수의 점수를 명예의 전당에 추가
            hallOfFame.add(score[i]);
            
            // 명예의 전당을 내림차순으로 정렬
            Collections.sort(hallOfFame, Collections.reverseOrder());
            
            // 명예의 전당의 크기가 k를 초과하면 최하위 점수 제거
            if (hallOfFame.size() > k) {
                hallOfFame.remove(hallOfFame.size() - 1);
            }
            
            // 현재 명예의 전당의 최하위 점수를 결과 배열에 저장
            answer[i] = hallOfFame.get(hallOfFame.size() - 1);
        }
        
        return answer;
    }
}