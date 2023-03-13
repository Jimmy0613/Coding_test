class Solution {
    public int solution(int n) {
        int answer = 0;
        int count=1;
        for(int i=4; i<=n; i++){
            count=1;
            for(int j=2; j<=i; j++){
                if(i%j==0)
                    count++;
            }
            if(count>=3)
                answer++;
        }
        return answer;
    }
}