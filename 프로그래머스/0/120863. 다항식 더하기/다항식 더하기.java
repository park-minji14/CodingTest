class Solution {
    public String solution(String polynomial) {
        int 계수 = 0; // x 항의 계수
        int 상수 = 0; // 상수 항

        // 다항식을 + 기준으로 나누어서 각 항의 계수와 상수를 구함
        for (String 항 : polynomial.split(" \\+ ")) {
            if (항.contains("x")) { // x 항인 경우
                if (항.equals("x")) { // x만 있는 경우
                    계수++;
                } else { // ax 형태의 경우
                    계수 += Integer.parseInt(항.replaceAll("x", ""));
                }
            } else { // 상수 항인 경우
                상수 += Integer.parseInt(항);
            }
        }

        // 결과 문자열 만들기
        StringBuilder 결과 = new StringBuilder();
        if (계수 != 0) {
            결과.append(계수 == 1 ? "x" : 계수 + "x");
        }
        if (상수 != 0) {
            if (결과.length() != 0) {
                결과.append(" + ");
            }
            결과.append(상수);
        }
        return 결과.length() == 0 ? "0" : 결과.toString();
    }
}