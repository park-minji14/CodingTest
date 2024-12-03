class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // 삭제할 숫자들을 표시하기 위한 boolean 배열 생성 (최댓값 1000)
        boolean[] toDelete = new boolean[1001];
        
        // delete_list의 숫자들을 toDelete 배열에 표시
        for (int num : delete_list) {
            toDelete[num] = true;
        }
        
        // 삭제하지 않을 숫자의 개수 세기
        int count = 0;
        for (int num : arr) {
            if (!toDelete[num]) {
                count++;
            }
        }
        
        // 삭제하지 않을 숫자들을 담을 새로운 배열 생성
        int[] answer = new int[count];
        int index = 0;
        for (int num : arr) {
            if (!toDelete[num]) {
                answer[index++] = num;
            }
        }
        
        return answer;
    }
}