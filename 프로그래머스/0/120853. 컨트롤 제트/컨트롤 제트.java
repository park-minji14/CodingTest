import java.util.Stack;

class Solution {
    public int solution(String s) {
        String[] tokens = s.split(" ");
        Stack<Integer> numbers = new Stack<>();
        int answer = 0;
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!numbers.isEmpty()) {
                    answer -= numbers.pop();
                }
            } else {
                int num = Integer.parseInt(token);
                numbers.push(num);
                answer += num;
            }
        }
        
        return answer;
    }
}