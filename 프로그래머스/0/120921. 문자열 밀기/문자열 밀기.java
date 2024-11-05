class Solution {
    public int solution(String A, String B) {
        // 두 문자열의 길이가 다르면 -1 반환
        if (A.length() != B.length()) {
            return -1;
        }
        
        // A와 B가 같으면 0 반환 (회전 불필요)
        if (A.equals(B)) {
            return 0;
        }
        
        int n = A.length();
        
        // 한 글자씩 회전하면서 B와 같아지는지 확인
        for (int i = 1; i <= n; i++) {
            // 오른쪽으로 i칸 회전
            String rotated = A.substring(n - i) + A.substring(0, n - i);
            if (rotated.equals(B)) {
                return i;
            }
        }
        
        // B로 만들 수 없는 경우 -1 반환
        return -1;
    }
}