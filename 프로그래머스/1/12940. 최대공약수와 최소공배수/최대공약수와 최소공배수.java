class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);    // 최대공약수
        int lcm = (n * m) / gcd;   // 최소공배수 = 두 수의 곱 / 최대공약수
        
        return new int[]{gcd, lcm};
    }
    
    // 유클리드 호제법으로 최대공약수 계산
    private int getGCD(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}