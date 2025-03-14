import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        // 오른쪽 조각의 토핑 종류와 개수를 저장하는 해시맵
        HashMap<Integer, Integer> rightPiece = new HashMap<>();
        
        // 왼쪽 조각의 토핑 종류를 저장하는 해시셋
        HashSet<Integer> leftPiece = new HashSet<>();
        
        // 먼저 모든 토핑을 오른쪽 조각에 할당
        for (int t : topping) {
            // 해당 토핑의 개수를.getOrDefault(t, 0) + 1로 증가시킴
            rightPiece.put(t, rightPiece.getOrDefault(t, 0) + 1);
        }
        
        // 토핑을 하나씩 왼쪽으로 이동시키면서 확인
        for (int t : topping) {
            // 현재 토핑을 왼쪽 조각에 추가
            leftPiece.add(t);
            
            // 오른쪽 조각에서 현재 토핑 하나 제거
            rightPiece.put(t, rightPiece.get(t) - 1);
            
            // 만약 오른쪽 조각에서 해당 토핑이 더 이상 없다면 해시맵에서 제거
            if (rightPiece.get(t) == 0) {
                rightPiece.remove(t);
            }
            
            // 양쪽 조각의 토핑 종류 수가 같은지 확인
            if (leftPiece.size() == rightPiece.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}