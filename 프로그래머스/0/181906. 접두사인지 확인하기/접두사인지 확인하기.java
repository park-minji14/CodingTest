class Solution {
    public int solution(String my_string, String is_prefix) {
        // startsWith() 메소드를 사용하여 my_string이 is_prefix로 시작하는지 확인
        // 접두사라면 1, 아니면 0을 반환
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}