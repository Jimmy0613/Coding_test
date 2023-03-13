class Solution {
    public int solution(int price) {
        int answer = 0;
        if(100000<=price && price<300000){
            answer = price * 95 / 100;
        } else if(300000<=price && price<500000){
            answer = price * 90 / 100;
        } else if(500000<=price){
            answer = price * 80 / 100;
        } else answer = price;
        return answer;
    }
}