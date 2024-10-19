import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
            stk.add(arr[i]);
        }
        
        // ArrayList를 int[] 배열로 변환
        return stk.stream().mapToInt(i -> i).toArray();
    }
}