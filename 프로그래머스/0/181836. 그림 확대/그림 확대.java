class Solution {
    public String[] solution(String[] picture, int k) {
        // 원본 그림의 세로, 가로 크기 구하기
        int height = picture.length;
        int width = picture[0].length();
        
        // 확대된 그림의 세로 크기는 원본 * k
        String[] answer = new String[height * k];
        
        // 각 행을 k배 확대하여 처리
        for (int i = 0; i < height; i++) {
            // 현재 행의 문자열을 가져옴
            String currentRow = picture[i];
            
            // 확대된 행을 저장할 StringBuilder
            StringBuilder enlargedRow = new StringBuilder();
            
            // 각 문자를 k번 반복하여 가로로 확대
            for (int j = 0; j < width; j++) {
                char c = currentRow.charAt(j);
                for (int x = 0; x < k; x++) {
                    enlargedRow.append(c);
                }
            }
            
            // 동일한 행을 k번 반복하여 세로로 확대
            String enlargedString = enlargedRow.toString();
            for (int y = 0; y < k; y++) {
                answer[i * k + y] = enlargedString;
            }
        }
        
        return answer;
    }
}