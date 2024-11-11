class Solution {
    public String[] solution(String[] str_list) {
        // "l"이나 "r"의 위치와 어떤 문자가 먼저 나왔는지 확인
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l"을 먼저 만난 경우, 왼쪽 부분 반환
                String[] result = new String[i];
                for (int j = 0; j < i; j++) {
                    result[j] = str_list[j];
                }
                return result;
            } 
            else if (str_list[i].equals("r")) {
                // "r"을 먼저 만난 경우, 오른쪽 부분 반환
                String[] result = new String[str_list.length - (i + 1)];
                for (int j = 0; j < result.length; j++) {
                    result[j] = str_list[i + 1 + j];
                }
                return result;
            }
        }
        
        // "l"이나 "r"이 없는 경우 빈 배열 반환
        return new String[]{};
    }
}