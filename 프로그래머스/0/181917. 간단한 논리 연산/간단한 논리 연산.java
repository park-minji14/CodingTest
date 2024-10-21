class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // (`x1` ∨ `x2`) ∧ (`x3` ∨ `x4`) 구현
        boolean firstPart = x1 || x2;  // x1 ∨ x2
        boolean secondPart = x3 || x4; // x3 ∨ x4
        boolean result = firstPart && secondPart; // (x1 ∨ x2) ∧ (x3 ∨ x4)
        
        return result;
    }
}