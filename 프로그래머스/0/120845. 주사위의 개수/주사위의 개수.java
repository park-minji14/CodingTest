class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // 각 차원(가로, 세로, 높이)에 대해 들어갈 수 있는 주사위의 개수를 계산
        int widthCount = box[0] / n;
        int lengthCount = box[1] / n;
        int heightCount = box[2] / n;
        
        // 세 차원의 주사위 개수를 곱하여 총 개수를 구함
        answer = widthCount * lengthCount * heightCount;
        
        return answer;
    }
}