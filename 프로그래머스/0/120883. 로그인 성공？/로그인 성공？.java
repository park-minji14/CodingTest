class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];  // 입력된 아이디
        String pw = id_pw[1];  // 입력된 비밀번호
        
        // 입력된 아이디가 DB에 존재하는지 확인하는 플래그
        boolean idExists = false;
        
        // DB의 모든 계정 정보를 확인
        for(String[] account : db) {
            String dbId = account[0];  // DB의 아이디
            String dbPw = account[1];  // DB의 비밀번호
            
            // 아이디가 일치하는 경우
            if(id.equals(dbId)) {
                idExists = true;  // 아이디 존재 플래그 설정
                
                // 비밀번호도 일치하는 경우
                if(pw.equals(dbPw)) {
                    return "login";  // 로그인 성공
                } else {
                    return "wrong pw";  // 비밀번호 불일치
                }
            }
        }
        
        // 아이디가 DB에 없는 경우
        if(!idExists) {
            return "fail";  // 로그인 실패
        }
        
        return "fail";  // 기본 반환값 (여기까지 오면 실패)
    }
}