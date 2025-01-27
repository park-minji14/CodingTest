class Solution {
    public int solution(int[][] sizes) {
        // 최대 가로 길이와 최대 세로 길이를 저장할 변수
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 모든 명함을 순회
        for (int[] card : sizes) {
            // 각 명함의 가로, 세로 길이
            int width = card[0];
            int height = card[1];
            
            // 가로가 세로보다 작다면 회전시킴 (더 긴 쪽이 항상 가로가 되도록)
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }
            
            // 최대 가로, 세로 길이 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        // 지갑의 크기 = 최대 가로 길이 x 최대 세로 길이
        return maxWidth * maxHeight;
    }
}