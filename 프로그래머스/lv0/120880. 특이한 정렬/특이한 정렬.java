class Solution {
    public int[] solution(int[] numlist, int n) {
        int[][] copy = new int[numlist.length][2];
        for(int i=0; i<numlist.length; i++){
            //numlist[i]와 n의 차이를 copy[i][0]에 저장합니다.
            copy[i][0] = numlist[i]-n>0? numlist[i]-n : n-numlist[i]; 
            //copy[i][1]에는 원래 숫자를 저장합니다.
            copy[i][1] = numlist[i];
        }
        //for문을 돌려 버블 정렬로 차이가 작은 순서대로 정렬합니다.(오름차순)
        for(int i=0; i<copy.length; i++){
            for(int j=i+1; j<copy.length; j++){
                //j보다 차이가 크면 자리바꿈
                if(copy[i][0]>copy[j][0]){
                    int[] temp = {copy[i][0], copy[i][1]};
                    copy[i][0] = copy[j][0];
                    copy[i][1] = copy[j][1];
                    copy[j][0] = temp[0];
                    copy[j][1] = temp[1];
                //j랑 차이가 같으면
                } else if(copy[i][0]==copy[j][0]){
                    //j보다 원래 숫자가 작으면 자리바꿈
                    if(copy[i][1]<copy[j][1]){
                        int[] temp = {copy[i][0],copy[i][1]};
                        copy[i][0] = copy[j][0];
                        copy[i][1] = copy[j][1];
                        copy[j][0] = temp[0];
                        copy[j][1] = temp[1];
                    }
                }
            }
            
        }
        int[] answer = new int[numlist.length];
        //for문을 또 돌려서 copy[i][1] 과 numlist[j]가 일치하면 answer[i]에 저장합니다.
        for(int i = 0; i<copy.length; i++){
            for(int j=0; j<copy.length; j++){
                if(copy[i][1]==numlist[j]){
                    answer[i] = numlist[j];
                }
            }
        }
        return answer;
    }
}