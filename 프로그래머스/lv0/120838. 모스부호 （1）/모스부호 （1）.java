class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s: arr){
            for(int i=0; i<code.length; i++){
                if(s.equals(code[i]))
                    answer+=(char)(i+97);
            }
        }
        
        return answer;
    }
}