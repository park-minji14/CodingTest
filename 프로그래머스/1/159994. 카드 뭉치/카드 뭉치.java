class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1과 cards2의 현재 사용할 카드의 인덱스를 추적
        int index1 = 0;
        int index2 = 0;
        
        // goal 배열의 각 단어를 순회하면서 확인
        for (String targetWord : goal) {
            // cards1에서 현재 단어를 찾을 수 있는지 확인
            if (index1 < cards1.length && targetWord.equals(cards1[index1])) {
                index1++; // cards1의 다음 카드로 이동
                continue;
            }
            
            // cards2에서 현재 단어를 찾을 수 있는지 확인
            if (index2 < cards2.length && targetWord.equals(cards2[index2])) {
                index2++; // cards2의 다음 카드로 이동
                continue;
            }
            
            // 현재 단어를 어느 카드 뭉치에서도 찾지 못한 경우
            return "No";
        }
        
        // 모든 goal의 단어를 순서대로 찾은 경우
        return "Yes";
    }
}