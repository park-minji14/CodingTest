class Solution {
    public String solution(String myString) {
        // 입력받은 myString이 주어진 조건(1 <= myString <= 100,000)을 만족하는지 확인
        if (1 <= myString.length() && myString.length() <= 100_000) {
            StringBuilder answer = new StringBuilder();
            for (char c : myString.toCharArray()) {
                if (c < 'l') {
                    answer.append('l');
                } else {
                    answer.append(c);
                }
            }
            return answer.toString();
        }
        // 주어진 조건을 만족하지 않는 경우 null을 리턴
        return null;
    }
}