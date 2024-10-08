class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        
        for (int num : num_list) {
            product *= num;
            sum += num;
        }
        
        sum = sum * sum;
        
        return product < sum ? 1 : 0;
    }
}