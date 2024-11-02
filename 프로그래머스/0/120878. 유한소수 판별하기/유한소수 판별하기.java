class Solution {
    public int solution(int a, int b) {
        // 기약분수로 만들기 위해 최대공약수로 약분
        int gcd = getGCD(a, b);
        b /= gcd;  // 분모를 최대공약수로 나눔
        
        // 분모의 소인수가 2와 5만 있는지 확인
        // 2와 5로 나눠질 수 있는 만큼 나눔
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        
        // 남은 분모가 1이면 유한소수, 아니면 무한소수
        return (b == 1) ? 1 : 2;
    }
    
    // 최대공약수를 구하는 메서드 (유클리드 호제법)
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}