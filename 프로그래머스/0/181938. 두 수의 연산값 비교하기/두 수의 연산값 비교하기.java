class Solution {
    public int solution(int a, int b) {
        int concatenated = Integer.parseInt("" + a + b);
        int multiplied = 2 * a * b;
        
        return Math.max(concatenated, multiplied);
    }
}