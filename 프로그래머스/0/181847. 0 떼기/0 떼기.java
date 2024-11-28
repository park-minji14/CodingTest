class Solution {
    public String solution(String n_str) {
        // "0010"의 경우 첫 번째 "0"을 제거하여 "10"을 만듦ㅁ.
        return n_str.replaceFirst("^0+", "");
    }
}