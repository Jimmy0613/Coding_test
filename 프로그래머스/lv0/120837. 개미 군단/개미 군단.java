class Solution {
    public int solution(int hp) {
        int g = 0; //장군 5
        int s = 0; //병정 3
        int a = 0; //일개미 1
        g = hp/5;
        if(hp-5*g>0){
            s=(hp-5*g)/3;
            if(hp-5*g-3*s>0){
                a=hp-5*g-3*s;
            }
        }
        int answer = g + s + a;
        return answer;
    }
}