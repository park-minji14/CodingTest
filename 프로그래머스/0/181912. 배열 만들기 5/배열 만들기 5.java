class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 임시 저장을 위한 배열 생성
        int[] temp = new int[intStrs.length];
        int count = 0;
        
        // 각 문자열 처리
        for (String str : intStrs) {
            // s 인덱스부터 l 길이만큼 추출
            String extracted = str.substring(s, s + l);
            
            // 정수로 변환
            int num = Integer.parseInt(extracted);
            
            // k보다 큰 경우에만 배열에 추가
            if (num > k) {
                temp[count++] = num;
            }
        }
        
        // 최종 결과 배열 생성
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}