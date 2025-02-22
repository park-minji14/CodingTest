class Solution {
    public int solution(int n, int a, int b) {
        int round = 0; // 라운드 수를 저장할 변수
        
        // 두 참가자가 만나기 전까지 반복
        while (a != b) {
            a = (a + 1) / 2; // 다음 라운드에서의 A의 번호
            b = (b + 1) / 2; // 다음 라운드에서의 B의 번호
            round++; // 라운드 증가
        }
        
        return round; // A와 B가 만나는 라운드 반환
    }
}
