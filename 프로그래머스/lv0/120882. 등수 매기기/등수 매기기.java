class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] avg = new float[score.length];

        //앞에는 평균 뒤에는 원래 index
        float[][] avg_index =  new float[score.length][2];
        for(int i=0; i<score.length; i++){
            avg_index[i][0] = ((float)score[i][0]+(float)score[i][1])/2;
            avg_index[i][1] = i;
        }
        //avg_index[i][0] 기준으로 내림차순 정렬해줍니다(점수 높은 순서)
        for(int i=0; i<score.length; i++){
            for(int j = i+1; j<score.length; j++ ){
                if(avg_index[i][0]<avg_index[j][0]){
                    float[] temp = {avg_index[i][0], avg_index[i][1]};
                    avg_index[i][0] = avg_index[j][0];
                    avg_index[i][1] = avg_index[j][1];
                    avg_index[j][0] = temp[0];
                    avg_index[j][1] = temp[1];
                }
            }
        }

        //순위를 담아줍니다..
        for(int i=0; i<avg_index.length; i++){
            for(int j=0; j<score.length; j++){
                //원래 인덱스랑 같은 거 찾아서 answer[j]에 넣음
                if(avg_index[i][1]==j){
                    answer[j] = i+1;
                    //앞순위랑 점수가 같으면 그 인덱스 순위랑 같은걸로 바꿈
                    if(i>0 && avg_index[i][0]==avg_index[i-1][0]){
                        answer[j] = answer[(int)avg_index[i-1][1]];
                    } 
                    
                }
            }
        }
  
        return answer;
    }
}