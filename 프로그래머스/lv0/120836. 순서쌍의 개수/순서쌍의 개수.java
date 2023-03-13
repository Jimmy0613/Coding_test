class Solution {
    public int solution(int n) {
        int count = 0; //n의 약수의 개수
        for(int i=1; i<=n ; i++){
            if(n%i==0)
                count++;
        }
        int answer = count;
        return answer;
    }
}