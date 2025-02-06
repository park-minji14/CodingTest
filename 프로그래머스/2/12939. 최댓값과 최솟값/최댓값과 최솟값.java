class Solution {
    public String solution(String s) {
        // 문자열을 공백으로 분리하여 숫자들을 배열로 변환
        String[] numbers = s.split(" ");
        
        // 최소값과 최대값을 저장할 변수 초기화
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        // 배열을 순회하면서 최소값과 최대값을 찾음
        for (String num : numbers) {
            int current = Integer.parseInt(num);
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        
        // 최소값과 최대값을 문자열로 변환하여 반환
        return min + " " + max;
    }
}