class Solution {
    public String solution(String phone_number) {
        // String.repeat()을 사용하여 '*' 문자를 반복
        // substring으로 마지막 4자리를 가져와서 연결
        return "*".repeat(phone_number.length() - 4) + 
               phone_number.substring(phone_number.length() - 4);
    }
}