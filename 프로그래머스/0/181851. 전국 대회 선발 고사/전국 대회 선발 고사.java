import java.util.Arrays;  // Arrays.sort를 사용하기 위한 import 추가

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 학생들의 등수와 번호를 저장할 배열 생성 (학생 번호, 등수)
        int[][] students = new int[rank.length][2];
        
        // 학생들의 번호와 등수를 배열에 저장
        for (int i = 0; i < rank.length; i++) {
            students[i][0] = i;        // 학생 번호
            students[i][1] = rank[i];  // 학생 등수
        }
        
        // 등수를 기준으로 정렬 (오름차순)
        Arrays.sort(students, (a, b) -> a[1] - b[1]);
        
        // 참가 가능한 상위 3명의 학생 번호를 저장할 배열
        int[] selected = new int[3];
        int idx = 0;  // selected 배열의 인덱스
        
        // 정렬된 배열을 순회하면서 참가 가능한 학생 3명 선발
        for (int i = 0; i < students.length && idx < 3; i++) {
            int studentNum = students[i][0];
            if (attendance[studentNum]) {  // 참가 가능한 학생인 경우
                selected[idx++] = studentNum;
            }
        }
        
        // 문제에서 요구하는 공식에 따라 결과값 계산
        // 10000 × a + 100 × b + c
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
    }
}