class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int x = -50; x<=1000; x++){
            for(int i = 0; i<num; i++){
                answer[i] = x + i;
            }        
            int sum = 0;
            for(int a : answer){
                sum += a;
            }
            if(sum==total){
                return answer;
            }
        }
        return answer;
    }
}