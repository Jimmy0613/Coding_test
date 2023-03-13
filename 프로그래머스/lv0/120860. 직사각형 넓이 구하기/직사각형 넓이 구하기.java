class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;//가로
        int b = 0;//세로
        //가로의 길이=y좌표의 값이 같은 점 두개의 x좌표 값끼리 빼기
        //값이 같은 점을 찾는 로직이 더 좋은 게 있을 것 같아요,,
        if(dots[0][1]==dots[1][1]){
            a=dots[0][0]-dots[1][0];
        } else if(dots[0][1]==dots[2][1]){
            a=dots[0][0]-dots[2][0];
        } else{
            a=dots[0][0]-dots[3][0];
        }
        //세로의 길이=x좌표의 값이 같은 점 두개의 y좌표 값끼리 빼기
        if(dots[0][0]==dots[1][0]){
            b=dots[0][1]-dots[1][1];
        } else if(dots[0][0]==dots[2][0]){
            b=dots[0][1]-dots[2][1];
        } else{
            b=dots[0][1]-dots[3][1];
        }
        //가로*세로
        answer = a*b;
        //음수일까봐 양수만들어주는거
        if(answer<0)
            return answer*-1;
        return answer;
    }
}