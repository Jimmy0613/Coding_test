class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = new int[emergency.length];
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            copy[i]=emergency[i]; //emergency 복사
        }
        //내림차순 정렬함
        for(int i=0; i<emergency.length; i++){
            for(int j = i+1; j<emergency.length; j++){
                if(emergency[j]>emergency[i]){
                    int temp = emergency[i];
                    emergency[i] = emergency[j];
                    emergency[j] = temp;
                }
            }
        }
        for(int i=0; i<copy.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[j]==copy[i]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}