class Solution {
    /**
     * 문자열에서 특정 간격으로 문자를 추출하는 메소드
     * @param q 나누는 수
     * @param r 원하는 나머지 값 (0 <= r < q)
     * @param code 입력 문자열
     * @return 추출된 문자들로 만든 새로운 문자열
     */
    public String solution(int q, int r, String code) { 
        // 결과 문자열을 만들기 위한 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        
        // code의 각 문자의 인덱스를 q로 나눈 나머지가 r인 문자만 추출
        for (int i = r; i < code.length(); i += q) {
            // 해당 위치의 문자를 결과 문자열에 추가
            sb.append(code.charAt(i));
        }
        
        // 최종 결과 문자열 반환
        return sb.toString();
    }
}