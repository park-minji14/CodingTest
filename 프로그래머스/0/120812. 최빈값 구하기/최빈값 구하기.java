import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        if (array.length == 1) return array[0];

        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mode = -1;

        for (int num : array) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mode = num;
            } else if (count == maxCount && num != mode) {
                mode = -1;
            }
        }

        return mode;
    }
}