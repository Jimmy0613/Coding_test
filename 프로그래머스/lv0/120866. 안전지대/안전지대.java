class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        if(board.length==1){
            if(board[0][0]==1)
                return 0;
            else 
                return 1;
        }
        //i는 row j는 컬럼
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==1){
                    if(i-1>=0){
                        board[i-1][j] = (board[i-1][j] == 1 ? 1 : -1); 
                        if(j-1>=0){
                            board[i-1][j-1] = (board[i-1][j-1] == 1 ? 1 : -1);
                        }
                        if(j+1<=board.length-1){
                            board[i-1][j+1] = (board[i-1][j+1] == 1 ? 1 : -1);
                        }
                    } 
                    if(i+1 <= board.length-1){
                        board[i+1][j] = (board[i+1][j] == 1 ? 1 : 2);
                        if(j-1>=0){
                            board[i+1][j-1] = (board[i+1][j-1] == 1 ? 1 : -1);
                        }
                        if(j+1<=board.length-1){
                            board[i+1][j+1] = (board[i+1][j+1] == 1 ? 1 : -1);
                        }
                    }
                    if(j-1>=0){
                        board[i][j-1] = (board[i][j-1] == 1 ? 1 : -1);
                    }
                    if(j+1<=board.length-1){
                        board[i][j+1] = (board[i][j+1] == 1 ? 1 : -1); 
                    }
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}