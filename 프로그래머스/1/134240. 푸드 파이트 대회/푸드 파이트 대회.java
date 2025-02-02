class Solution {
    public String solution(int[] food) {
        // 결과 문자열을 저장할 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        
        // 1번 음식부터 순회 (0번은 물이므로 제외)
        for (int i = 1; i < food.length; i++) {
            // 각 음식을 두 선수가 나눠 먹을 수 있는 개수 계산
            int count = food[i] / 2;
            
            // 해당 음식 번호를 count만큼 반복해서 추가
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        
        // 가운데 물(0) 추가
        answer.append("0");
        
        // 왼쪽 선수의 음식 배치를 뒤집어서 오른쪽 선수의 음식 배치 생성
        String reversed = answer.substring(0, answer.length() - 1);
        answer.append(new StringBuilder(reversed).reverse());
        
        return answer.toString();
    }
}