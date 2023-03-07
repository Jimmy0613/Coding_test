class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = sides[0];
        int y = sides[1];
        if(x==y){
            for(int i=1; i<=2000; i++){
                if(i>x && x+y>i){
                    answer++;
                } else if(i<=x && i+x>y){
                    answer++;
                }
            }
        } else {
            int max = x>y? x:y;
            int min = x<y? x:y;
            
            for(int i=1; i<=2000; i++){
                if(max>i && min+i>max){
                     answer++; 
                } else if(max<=i && max+min>i){
                    answer++;
                }
            }
           
        }
        return answer;
    }
}