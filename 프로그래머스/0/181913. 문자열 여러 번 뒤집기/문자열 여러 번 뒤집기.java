class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            StringBuilder temp = new StringBuilder(sb.substring(start, end + 1));
            temp.reverse();
            sb.replace(start, end + 1, temp.toString());
        }
        
        return sb.toString();
    }
}