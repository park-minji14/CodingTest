class Solution {
    public long solution(String numbers) {
        // 영단어와 숫자 매핑
        String[] numberWords = {"zero", "one", "two", "three", "four", 
                              "five", "six", "seven", "eight", "nine"};
        
        // 결과 문자열을 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // 현재 처리 중인 문자열을 저장할 StringBuilder
        StringBuilder current = new StringBuilder();
        
        // 문자열을 한 글자씩 처리
        for (char c : numbers.toCharArray()) {
            current.append(c);
            
            // 현재까지 만들어진 문자열이 숫자 단어인지 확인
            for (int i = 0; i < numberWords.length; i++) {
                if (current.toString().equals(numberWords[i])) {
                    result.append(i);  // 해당하는 숫자를 결과에 추가
                    current = new StringBuilder();  // 현재 문자열 초기화
                    break;
                }
            }
        }
        
        // 최종 결과를 long 타입으로 변환하여 반환
        return Long.parseLong(result.toString());
    }
}