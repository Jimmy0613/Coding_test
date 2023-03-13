class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        if(n==1)
            return 1;
        for(int i=2; i<=10; i++){
            a*=i;
            if(a>n){
                answer=i-1;
                break;
            }else if(a==n){
                answer = i;
                break;
            }

        }
        return answer;
    }
}