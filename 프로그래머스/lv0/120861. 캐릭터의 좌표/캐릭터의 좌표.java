class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        //0에서 오른쪽으로 갈 수 있는 가장 먼 좌표
        int maxR = board[0]/2; 
        //0에서 왼쪽으로 갈 수 있는 가장 먼 좌표
        int maxL = 0 - board[0]/2;
        //0에서 위로 어쩌구
        int maxU = board[1]/2;
        //0에서 아래로 어쩌구
        int maxD = 0 - (int)board[1]/2;
        for(int i=0; i<keyinput.length; i++){

            int a = answer[0];
            int b = answer[1];
            switch(keyinput[i]) {
                case "left":
                    if(a>maxL) answer[0]-=1;
                    break;
                case "right":
                    if(a<maxR) answer[0]+=1;
                    break;
                case "up":
                    if(b<maxU) answer[1]+=1;
                    break;
                case "down":
                    if(b>maxD) answer[1]-=1;
                    break;
            }
        }

        return answer;
    }
}