class Solution {
   public int solution(int[] num_list) {
       int answer = 0;
       
       // 각 숫자마다 1이 될 때까지의 연산 횟수를 더함
       for(int num : num_list) {
           while(num != 1) {  // 1이 될 때까지 반복
               if(num % 2 == 0) {  // 짝수면 2로 나누기
                   num /= 2;
               } else {  // 홀수면 1을 빼고 2로 나누기
                   num = (num-1) / 2;
               }
               answer++;  // 연산 횟수 증가
           }
       }
       
       return answer;
   }
}