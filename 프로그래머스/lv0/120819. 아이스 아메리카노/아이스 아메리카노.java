class Solution {
    public int[] solution(int money) {
        int x = -1; //잔수
        int y = -1; //잔돈
        if(money<5500){
            x=0;
            y=money;
        } else {
            x=money/5500;
            y=money%5500;
        }
        int[] answer = {x,y};
        return answer;
    }
}