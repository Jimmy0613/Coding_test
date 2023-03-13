class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            char a=rsp.charAt(i);
            switch(a){
                case '2':
                    answer+="0";
                    break;
                case '5':
                    answer+="2";
                    break;
                default:
                    answer+="5";
            }
        }
        return answer;
    }
}