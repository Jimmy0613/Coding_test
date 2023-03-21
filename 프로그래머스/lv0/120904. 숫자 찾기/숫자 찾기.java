class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String x = num + "";
        for(int i=0; i<x.length(); i++){
            if(Integer.parseInt(x.substring(i,i+1))==k){
                return i+1;
            }
        }
        return answer;
    }
}