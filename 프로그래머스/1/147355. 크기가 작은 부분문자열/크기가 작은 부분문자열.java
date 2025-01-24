class Solution {
    public int solution(String t, String p) {
        // 결과값을 저장할 변수
        int answer = 0;
        
        // p의 길이만큼의 부분문자열을 비교하기 위한 길이 저장
        int len = p.length();
        
        // p를 long타입으로 변환 (비교를 위해)
        long numP = Long.parseLong(p);
        
        // t 문자열을 순회하면서 p길이만큼의 부분문자열 추출 및 비교
        // i + len이 t의 길이를 넘어가지 않도록 제한
        for(int i = 0; i <= t.length() - len; i++) {
            // 현재 위치(i)부터 p의 길이만큼 부분문자열 추출
            String sub = t.substring(i, i + len);
            
            // 추출한 부분문자열을 long으로 변환하여 p와 비교
            long numSub = Long.parseLong(sub);
            
            // p보다 작거나 같으면 카운트 증가
            if(numSub <= numP) {
                answer++;
            }
        }
        
        return answer;
    }
}