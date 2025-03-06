import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 각 작업이 완료되기까지 필요한 날짜 계산
        int[] daysLeft = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            // 남은 작업량에 대해 필요한 일수 계산 (올림 처리)
            daysLeft[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
        
        // 첫 번째 작업의 배포일
        int releaseDay = daysLeft[0];
        int count = 1;
        
        // 두 번째 작업부터 순회
        for (int i = 1; i < daysLeft.length; i++) {
            // 현재 작업의 완료일이 이전 배포일보다 이후인 경우
            if (daysLeft[i] > releaseDay) {
                // 이전까지 누적된 기능 개수를 배포
                answer.add(count);
                // 새로운 배포일 설정
                releaseDay = daysLeft[i];
                // 카운트 초기화
                count = 1;
            } else {
                // 현재 작업이 이전 배포일에 함께 배포 가능
                count++;
            }
        }
        
        // 마지막 배포에 포함된 기능 개수 추가
        answer.add(count);
        
        // ArrayList를 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}