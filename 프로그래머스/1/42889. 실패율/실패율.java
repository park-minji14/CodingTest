import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 실패율을 저장할 리스트
        List<double[]> failureRates = new ArrayList<>();
        
        // 스테이지에 도달한 사용자 수를 계산하기 위한 배열
        int[] stageCount = new int[N + 2];
        
        // 각 스테이지에 도달한 사용자 수 계산
        for (int stage : stages) {
            stageCount[stage]++;
        }
        
        // 전체 사용자 수 (초기에는 총 플레이어 수)
        int totalPlayers = stages.length;
        
        // 각 스테이지의 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                // 스테이지에 도달한 플레이어가 없는 경우 실패율 0
                failureRates.add(new double[]{i, 0});
            } else {
                // 실패율 계산
                double failureRate = (double) stageCount[i] / totalPlayers;
                failureRates.add(new double[]{i, failureRate});
                
                // 해당 스테이지를 클리어한 플레이어 수 빼기
                totalPlayers -= stageCount[i];
            }
        }
        
        // 실패율 기준으로 내림차순 정렬 (실패율이 같으면 스테이지 번호 오름차순)
        failureRates.sort((a, b) -> Double.compare(b[1], a[1]) != 0 ? Double.compare(b[1], a[1]) : Integer.compare((int) a[0], (int) b[0]));
        
        // 정렬된 결과에서 스테이지 번호만 추출하여 반환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failureRates.get(i)[0];
        }
        
        return answer;
    }
}