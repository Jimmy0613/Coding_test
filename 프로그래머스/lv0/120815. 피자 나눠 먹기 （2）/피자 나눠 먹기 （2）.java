class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n>=6){
            if(n%6==0){
                answer = n/6;
            } else if(n%2==0){
                int p = n * 3;
                answer = p/6;
            } else if(n%3==0){
                int p = n * 2;
                answer = p/6;
            } else {
                answer = n;
            }
        } else {
            if(n%2==0){
                int p = n * 3;
                answer = p/6;
            } else if(n%3==0){
                int p = n * 2;
                answer = p/6;
            } else {
                answer = n;
            }
        }
           
            
       
        
        return answer;
    }
}