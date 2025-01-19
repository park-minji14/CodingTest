import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 가로 n, 세로 m 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 세로 길이만큼 반복
        for(int i = 0; i < m; i++) {
            // 가로 길이만큼 별 출력
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}