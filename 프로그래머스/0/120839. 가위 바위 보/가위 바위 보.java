class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : rsp.toCharArray()) {
            switch (c) {
                case '2': // 가위
                    answer.append('0'); // 바위로 이김
                    break;
                case '0': // 바위
                    answer.append('5'); // 보로 이김
                    break;
                case '5': // 보
                    answer.append('2'); // 가위로 이김
                    break;
            }
        }
        
        return answer.toString();
    }
}