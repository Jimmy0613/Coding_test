class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i = 1; i > 0; i++){
            if(i*slice>=n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}