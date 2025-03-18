import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 1. 사과를 점수 기준으로 내림차순 정렬
        // 가장 높은 점수의 사과부터 사용하면 최대 이익을 얻을 수 있음
        Arrays.sort(score);
        
        // 2. 정렬된 배열을 뒤집어서 높은 점수부터 처리
        // (Java에서는 내림차순 정렬 대신 정렬 후 뒤에서부터 접근)
        
        // 3. m개씩 상자를 만들고 가격 계산
        // 배열의 끝에서부터 m개씩 그룹 지어 상자를 만듦
        int totalApples = score.length;
        int boxCount = totalApples / m; // 만들 수 있는 상자의 개수
        
        for (int i = 0; i < boxCount; i++) {
            // 각 상자에서 가장 낮은 점수의 사과 위치 계산
            // (정렬된 상태에서 m개씩 묶을 때 첫 번째 사과가 가장 낮은 점수)
            int minScoreIndex = totalApples - (i + 1) * m;
            
            // 해당 상자의 가격 계산: (최저 점수) * m
            answer += score[minScoreIndex] * m;
        }
        
        return answer;
    }
}