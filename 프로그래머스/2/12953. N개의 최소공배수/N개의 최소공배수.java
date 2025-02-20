class Solution {
    // 두 수의 최대공약수를 구하는 함수 (유클리드 알고리즘)
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 두 수의 최소공배수를 구하는 함수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public int solution(int[] arr) {
        // 배열의 첫 번째 원소로 answer 초기화
        int answer = arr[0];
        
        // 배열의 모든 원소에 대해 순차적으로 최소공배수 계산
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
}