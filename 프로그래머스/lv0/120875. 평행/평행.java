class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] a = {dots[0][0], dots[0][1]};
        int[] b = {dots[1][0], dots[1][1]};
        int[] c = {dots[2][0], dots[2][1]};
        int[] d = {dots[3][0], dots[3][1]};
        //a랑 b / c랑 d
        int x = (a[1]-b[1])/(a[0]-b[0]) + (a[1]-b[1])%(a[0]-b[0]); //x증가량분의 y증가량...
        int y = (c[1]-d[1])/(c[0]-d[0]) + (c[1]-d[1])%(c[0]-d[0]); // ``
        x = x<0?0-x:x;
        y = y<0?0-y:y;
        if(x==y) return answer = 1;
        //a랑 c / b랑 d
        x = (a[1]-c[1])/(a[0]-c[0]) + (a[1]-c[1])%(a[0]-c[0]); //x증가량분의 y증가량...
        y = (b[1]-d[1])/(b[0]-d[0]) + (b[1]-d[1])%(b[0]-d[0]); // ``
        x = x<0?0-x:x;
        y = y<0?0-y:y;
        if(x==y) return answer = 1;
        //a랑 d / b랑 c
        x = (a[1]-d[1])/(a[0]-d[0]) + (a[1]-d[1])%(a[0]-d[0]); //x증가량분의 y증가량...
        y = (c[1]-b[1])/(c[0]-b[0]) + (c[1]-b[1])%(c[0]-b[0]); // ``
        x = x<0?0-x:x;
        y = y<0?0-y:y;
        if(x==y) return answer = 1;
        return answer;
    }
}