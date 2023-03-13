class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        for(int i = 0; i<array.length; i++){
            int x = n-array[i]>0? n-array[i] : array[i]-n;
            if(x<min){
                answer = array[i];
                min=x;
            } else if(x==min){
                answer = array[i]<answer? array[i]: answer;
            }
        }
        return answer;
    }
}