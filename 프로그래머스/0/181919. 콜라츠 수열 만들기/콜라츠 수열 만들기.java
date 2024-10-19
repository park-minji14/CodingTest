import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);
        }
        
        // List<Integer>를 int[]로 변환
        int[] result = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            result[i] = sequence.get(i);
        }
        
        return result;
    }
}