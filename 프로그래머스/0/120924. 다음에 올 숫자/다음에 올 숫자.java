class Solution {
    public int solution(int[] common) {
        // 첫 번째와 두 번째 숫자의 차이
        int diff1 = common[1] - common[0];
        // 두 번째와 세 번째 숫자의 차이
        int diff2 = common[2] - common[1];
        
        // 등차수열인 경우: 두 차이가 같음
        if (diff1 == diff2) {
            // 마지막 숫자에 공차를 더함
            return common[common.length - 1] + diff1;
        }
        // 등비수열인 경우
        else {
            // 공비 계산 (두 번째 숫자 / 첫 번째 숫자)
            int ratio = common[1] / common[0];
            // 마지막 숫자에 공비를 곱함
            return common[common.length - 1] * ratio;
        }
    }
}