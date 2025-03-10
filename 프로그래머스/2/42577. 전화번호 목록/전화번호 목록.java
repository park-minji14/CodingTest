import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 전화번호 배열을 사전순으로 정렬
        Arrays.sort(phone_book);
        
        // 2. 인접한 두 번호만 비교하면 됨 (정렬되어 있으므로)
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 3. 현재 번호가 다음 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // 접두어가 존재하면 false 반환
            }
        }
        
        // 4. 접두어가 없으면 true 반환
        return true;
    }
}