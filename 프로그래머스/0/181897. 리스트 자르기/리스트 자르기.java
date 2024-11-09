class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // slicer의 값들을 추출
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        // 결과 배열의 크기 계산을 위한 변수들
        int start, end, step;
        
        // n값에 따라 다른 슬라이싱 로직 적용
        switch(n) {
            case 1: // 0부터 b까지
                start = 0;
                end = b;
                step = 1;
                break;
                
            case 2: // a부터 마지막까지
                start = a;
                end = num_list.length - 1;
                step = 1;
                break;
                
            case 3: // a부터 b까지
                start = a;
                end = b;
                step = 1;
                break;
                
            case 4: // a부터 b까지 c 간격으로
                start = a;
                end = b;
                step = c;
                break;
                
            default:
                return new int[]{};
        }
        
        // 결과 배열의 크기 계산
        int size = (end - start) / step + 1;
        int[] answer = new int[size];
        
        // 결과 배열 생성
        int idx = 0;
        for(int i = start; i <= end; i += step) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}