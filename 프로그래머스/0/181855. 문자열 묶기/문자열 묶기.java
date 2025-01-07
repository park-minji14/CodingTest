class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이별 개수를 저장할 배열 (문제 제한사항: 길이는 30 이하)
        int[] lengthCount = new int[31];
        
        // 각 문자열의 길이를 카운트
        for (String str : strArr) {
            lengthCount[str.length()]++;
        }
        
        // 가장 많은 개수를 가진 그룹 찾기
        int maxCount = 0;
        for (int count : lengthCount) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}