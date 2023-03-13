class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        //둘다 0이면 그냥 0 리턴
        if(bin1.equals("0")&&bin2.equals("0")){
            return answer = "0";
        }
        //둘다 10자리로 맞춰서 덧셈할때 편하게 함
        while(bin1.length()<10){
            bin1 = "0" + bin1;
        }
        while(bin2.length()<10){
            bin2 = "0" + bin2;
        }
        //만약 더했을때 2가 되면 x에 1를 저장해서 다음 덧셈에 1을 더해줌
        int x = 0;
        for(int i = 9; i>=0; i--){
            //0+0이면 원래 더하면 0이지만 x=1 이라면 1이 되고 x=0이 됨
            if(bin1.charAt(i)=='0' && bin2.charAt(i)=='0'){
                if(x == 1){
                    answer = 1 + answer;
                    x = 0;
                } else {
                    answer = 0 + answer;
                }
            //1+0이면 원래 1이지만 x가 1이면 0이 되고 다시 x=1로 넘김
            } else if(bin1.charAt(i)=='0' || bin2.charAt(i)=='0'){
                if(x==1){
                    answer = 0 + answer;
                    //굳이 안써줘도 되지만 가독성을 위해서 씀
                    x = 1;
                } else {
                    answer = 1 + answer;
                }
            //1+1이면 원래 0이고 x=1을 넘기지만 기존에 x가 이미 1이라면 1이 됨
            } else {
                if(x==1){
                    answer = 1 + answer;
                    x = 1;
                } else {
                    answer = 0 + answer;
                    x = 1; 
                }
            }
        }
        int startIndex = 0;
        for(int i = 0; i<answer.length(); i++){
            if(answer.charAt(i)=='1'){
                startIndex = i;
                break;
            }
        }
        String result = "";
        for(int i = startIndex; i<answer.length(); i++){
            result += answer.charAt(i);
        }
        //마지막에 x가 1로 남아있으면 한자리를 더 올려줌.
        if(x==1){
            result = 1 + result;
        }
       
        return result;
    }
}