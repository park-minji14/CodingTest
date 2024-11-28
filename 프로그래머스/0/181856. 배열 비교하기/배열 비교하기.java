class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // 배열 arr1의 길이가 arr2의 길이보다 크면 1 반환
        if (arr1.length > arr2.length) {
            return 1;
        }
        // 배열 arr2의 길이가 arr1의 길이보다 크면 -1 반환
        else if (arr1.length < arr2.length) {
            return -1;
        }
        // 두 배열의 길이가 같은 경우
        else {
            // 각 배열의 원소 합 계산
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            // 합이 더 큰 배열 반환
            if (sum1 > sum2) {
                return 1;
            } else if (sum1 < sum2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}