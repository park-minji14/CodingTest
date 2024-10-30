class Solution {
    public String[] solution(String my_str, int n) {
        // 결과 배열의 크기 계산 (올림 나눗셈 사용)
        int arraySize = (int) Math.ceil((double) my_str.length() / n);
        String[] answer = new String[arraySize];
        
        // 문자열을 n씩 잘라서 배열에 저장
        for (int i = 0; i < arraySize; i++) {
            // 시작 인덱스 계산
            int startIndex = i * n;
            // 끝 인덱스 계산 (문자열 길이를 초과하지 않도록)
            int endIndex = Math.min(startIndex + n, my_str.length());
            // 부분 문자열 추출하여 배열에 저장
            answer[i] = my_str.substring(startIndex, endIndex);
        }
        
        return answer;
    }
}