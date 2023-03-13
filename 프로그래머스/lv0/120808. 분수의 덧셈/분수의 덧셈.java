class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = 0;
        int b = 0;
        b = denom1 * denom2; //분모
        a = numer1 * denom2 + numer2 * denom1; //분자
        int min = (a<b) ? a:b;
        int max = (a>b) ? a:b;
        // if(a<b){
//        min =a;
//        max = b;        
//    } else{
//        min=b;
//        max=a;
//    }
        int r=-1;
        r = max % min;
        while(r!=0){
           // int temp = min;
            max = (r>min) ? r:min;
            min = (r<min) ? r:min;
            r = max % min;
        } //while문 빠져나올때 min이 최대공약수
        b = b/min;
        a = a/min;
        int[] answer = {a,b};
        return answer;
    }
}