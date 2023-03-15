class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String ks = k+"";
        char kc = ks.charAt(0);
        for(int x=i; x<=j; x++){
            String xs = x+"";
            while(xs.contains(ks)){
                answer++;
                for(int y = 0; y<xs.length();y++){
                    if(xs.charAt(y)==kc){
                        xs = xs.substring(0, y) + xs.substring(y+1);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}