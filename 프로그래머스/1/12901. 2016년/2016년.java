import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        // 2016년 a월 b일의 날짜를 생성
        LocalDate date = LocalDate.of(2016, a, b);
        
        // 해당 날짜의 요일을 가져옴
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // 요일을 문자열 배열을 이용해 변환
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        // DayOfWeek는 1(월요일)부터 7(일요일)까지 값을 가짐 -> 이를 배열에 매칭
        return days[dayOfWeek.getValue() - 1];
    }
}