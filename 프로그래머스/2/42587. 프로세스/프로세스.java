import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        // 실행 순서를 저장할 변수
        int answer = 0;
        
        // 프로세스 정보(우선순위와 원래 위치)를 담을 큐 생성
        Queue<Process> queue = new LinkedList<>();
        
        // 큐에 프로세스 정보 초기화
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }
        
        // 프로세스가 모두 실행될 때까지 반복
        while (!queue.isEmpty()) {
            // 현재 큐의 맨 앞 프로세스 꺼내기
            Process current = queue.poll();
            boolean hasHigherPriority = false;
            
            // 큐에 남아있는 다른 프로세스 중 우선순위가 더 높은 것이 있는지 확인
            for (Process p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            // 우선순위가 더 높은 프로세스가 있으면 현재 프로세스를 큐의 맨 뒤로 다시 넣음
            if (hasHigherPriority) {
                queue.offer(current);
            } else {
                // 우선순위가 가장 높은 프로세스라면 실행 (실행 순서 증가)
                answer++;
                
                // 찾고자 하는 프로세스라면 현재 실행 순서 반환
                if (current.initialPosition == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
    
    // 프로세스 정보를 담기 위한 내부 클래스
    class Process {
        int priority;        // 프로세스의 우선순위
        int initialPosition; // 프로세스의 초기 위치
        
        Process(int priority, int initialPosition) {
            this.priority = priority;
            this.initialPosition = initialPosition;
        }
    }
}