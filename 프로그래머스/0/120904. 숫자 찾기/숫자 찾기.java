class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int position = numStr.indexOf(kStr);
        return position >= 0 ? position + 1 : -1;
    }
}