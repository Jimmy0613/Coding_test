class Solution {
    public int solution(int n) {
        int answer = 0;
        String x = n + "";
        for(int i=0; i<x.length(); i++){
            answer+= Integer.parseInt(x.charAt(i)+"");
        }
        return answer;
    }
}