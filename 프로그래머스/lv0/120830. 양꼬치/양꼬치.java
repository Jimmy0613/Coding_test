class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sum = 12000*n + 2000*k;
        int sale = 0;
        if(n>=10){
            sale = n/10;
        }
        answer = sum - sale*2000;
        
        return answer;
    }
}