import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        // A 배열을 오름차순으로 정렬
        Arrays.sort(A);
        
        // B 배열을 내림차순으로 정렬
        // Integer 배열로 변환하여 내림차순 정렬
        Integer[] B_desc = new Integer[B.length];
        for(int i = 0; i < B.length; i++) {
            B_desc[i] = B[i];
        }
        Arrays.sort(B_desc, (a, b) -> b.compareTo(a));
        
        // 각 배열에서 순서대로 숫자를 선택하여 곱한 후 더함
        for(int i = 0; i < A.length; i++) {
            // A의 가장 작은 수와 B의 가장 큰 수를 곱하여 더함
            answer += A[i] * B_desc[i];
        }
        
        return answer;
    }
}