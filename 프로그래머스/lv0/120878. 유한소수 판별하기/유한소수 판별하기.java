import java.util.ArrayList;
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int min = (a<b) ? a:b;
        int max = (a>b) ? a:b;
        int r=-1;
        r = max % min;
        while(r!=0){
            max = (r>min) ? r:min;
            min = (r<min) ? r:min;
            r = max % min;
        }
        b = b/min;
        a = a/min;

        ArrayList<Integer> arr = new ArrayList<>();
        //b의 소인수(소인수분해 문제에서 베껴옴)
        int n = 1;
        if(b==1)
            return answer = 1; 
        while(true){
            n++;
            ii: if(b%n==0){
                for(int i=0; i<arr.size();i++){
                    if(n%arr.get(i)==0)
                        break ii;
                }
                arr.add(n);
            }
            if(b==n)
                break;
        }
        if(arr.size()!=0){
           if(arr.size()>2){
            return answer;
        } else if(arr.size()==2){
            if(arr.get(0)==2 && arr.get(1)==5){
                return answer = 1;
            } else {
                return answer;
            }
        } else {
            if(arr.get(0)==2 || arr.get(0)==5){
                return answer = 1;
            } else{
                return answer;
            }
        } 
        } else {
            return answer = 1;
        }
        
    }
}