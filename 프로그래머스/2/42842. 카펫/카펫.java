class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; // 결과를 담을 배열 [가로, 세로]
        
        // 카펫의 총 격자 수
        int total = brown + yellow;
        
        // 카펫의 가로 길이는 세로 길이보다 크거나 같아야 함
        // 가능한 모든 가로, 세로 조합을 확인
        for (int width = 3; width <= 5000; width++) { // 가로 길이는 최소 3 이상이어야 함 (노란색 격자가 존재하려면)
            // 세로 길이 계산 (총 격자 수 = 가로 x 세로)
            if (total % width != 0) continue; // 나누어 떨어지지 않으면 다음 가로 길이 시도
            
            int height = total / width;
            
            // 가로 길이가 세로 길이보다 크거나 같은지 확인
            if (width < height) continue;
            
            // 주어진 갈색 격자 수와 계산된 갈색 격자 수가 일치하는지 확인
            // 갈색 격자 수 = 전체 둘레(가로x2 + 세로x2 - 4) + 4 = 2*(가로+세로)
            int calculatedBrown = 2 * (width + height) - 4;
            
            if (calculatedBrown == brown) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        
        return answer;
    }
}