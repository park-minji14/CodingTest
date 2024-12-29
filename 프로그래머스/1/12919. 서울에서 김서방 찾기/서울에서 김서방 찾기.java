class Solution {
    public String solution(String[] seoul) {
        int position = 0;
        
        // Kim의 위치 찾기
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                position = i;
                break;
            }
        }
        
        // 결과 문자열 반환
        return "김서방은 " + position + "에 있다";
    }
}