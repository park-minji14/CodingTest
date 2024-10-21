class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] counts = new int[7]; // 주사위 눈금 개수를 저장할 배열 (1-6 사용)
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;
        
        int maxCount = 0;
        int maxNum = 0;
        
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxNum = i;
            }
        }
        
        // 모든 주사위가 같은 경우
        if (maxCount == 4) {
            return 1111 * maxNum;
        }
        
        // 세 주사위가 같은 경우
        if (maxCount == 3) {
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 1) {
                    return (10 * maxNum + i) * (10 * maxNum + i);
                }
            }
        }
        
        // 두 쌍의 주사위가 같은 경우
        if (maxCount == 2) {
            int p = 0, q = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    if (p == 0) p = i;
                    else q = i;
                }
            }
            if (q != 0) { // 두 쌍이 있는 경우
                return (p + q) * Math.abs(p - q);
            } else { // 한 쌍만 있는 경우
                int result = 1;
                for (int i = 1; i <= 6; i++) {
                    if (counts[i] == 1) {
                        result *= i;
                    }
                }
                return result;
            }
        }
        
        // 모든 주사위가 다른 경우
        int minNum = 7;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1 && i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }
}