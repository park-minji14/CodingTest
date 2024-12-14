class Solution {
    public int solution(int n) {
        // 2부터 시작해서 나머지가 1이 될 때까지 반복
        for(int x = 2; x < n; x++) {
            if(n % x == 1) {
                return x;
            }
        }
        // 못 찾았다면 n-1 리턴 (n % (n-1) = 1)
        return n - 1;
    }
}