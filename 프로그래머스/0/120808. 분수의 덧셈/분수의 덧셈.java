class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자 계산
        int numer = numer1 * denom2 + numer2 * denom1;
        // 분모 계산
        int denom = denom1 * denom2;
        
        // 최대공약수 계산
        int gcd = getGCD(numer, denom);
        
        // 기약분수로 만들어 반환
        return new int[]{numer / gcd, denom / gcd};
    }
    
    // 최대공약수를 구하는 함수
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}