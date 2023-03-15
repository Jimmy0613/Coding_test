class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //index 한칸씩 밀어버리기
        cipher = 0 + cipher;
        for(int i=1; i<cipher.length(); i++){
            if(i%code==0){
                answer+=cipher.charAt(i);
            }
        }
        return answer;
    }
}