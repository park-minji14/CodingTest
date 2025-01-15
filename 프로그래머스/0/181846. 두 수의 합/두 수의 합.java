import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // BigInteger를 사용하여 큰 수 계산
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        // 두 수를 더한 후 문자열로 변환하여 반환
        return numA.add(numB).toString();
    }
}