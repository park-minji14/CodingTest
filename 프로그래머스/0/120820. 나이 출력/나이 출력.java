class Solution {
    public int solution(int age) {
        final int REFERENCE_YEAR = 2022;
        int birthYear = REFERENCE_YEAR - age + 1;
        return birthYear;
    }
}