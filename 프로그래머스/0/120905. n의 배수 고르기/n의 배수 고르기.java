import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // n의 배수만 ArrayList에 추가
        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }
        
        // ArrayList를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}