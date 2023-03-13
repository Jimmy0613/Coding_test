class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length();i++){
            if((int)my_string.charAt(i)>=48&&(int)my_string.charAt(i)<=57){
                String x = my_string.charAt(i)+"";
                answer+=Integer.parseInt(x);
            }
        }
        return answer;
    }
}