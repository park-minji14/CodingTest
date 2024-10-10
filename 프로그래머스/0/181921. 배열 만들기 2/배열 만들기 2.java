import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int num = l; num <= r; num++) {
            if (isZeroAndFive(num)) {
                result.add(num);
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isZeroAndFive(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}