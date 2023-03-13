class Solution {
    public int solution(int[] numbers, int k) {
        int num=-1;
        int count=1;
        int answer=num;
       for(int i=1; i<=k; i++){
           num=num+2;
           if(num>numbers.length){
               count++;
               num=1;
                if(numbers.length%2==1){
                    if(count%2==0){
                        num=2;
                    }
                }
            } 
       }
        return num;
}
}