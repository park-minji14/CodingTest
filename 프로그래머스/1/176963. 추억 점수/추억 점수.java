class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 결과를 저장할 배열 생성 (photo 배열의 길이만큼)
        int[] answer = new int[photo.length];
        
        // 각 사진별로 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int score = 0; // 현재 사진의 추억 점수
            
            // 현재 사진에 있는 각 인물에 대해
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                
                // name 배열에서 해당 인물의 인덱스 찾기
                for (int k = 0; k < name.length; k++) {
                    // 인물을 찾으면 해당 그리움 점수 추가
                    if (name[k].equals(person)) {
                        score += yearning[k];
                        break; // 인물을 찾았으므로 더 이상 검색할 필요 없음
                    }
                }
            }
            
            // 계산된 추억 점수를 결과 배열에 저장
            answer[i] = score;
        }
        
        return answer;
    }
}