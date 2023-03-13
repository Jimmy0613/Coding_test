class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],Math.max(sides[1],sides[2]));
        if(max==sides[0]){
            if(sides[1]+sides[2]>max){
                return 1;
            } else{
                return 2;
            }
        } else if(max==sides[1]){
            if(sides[0]+sides[2]>max){
                return 1;
            } else{
                return 2;
            }
        } else{
            if(sides[0]+sides[1]>max){
                return 1;
            } else{
                return 2;
            }
        }
    }
}