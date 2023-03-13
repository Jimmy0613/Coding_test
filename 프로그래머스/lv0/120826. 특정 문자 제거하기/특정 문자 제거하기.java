class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        for(int i=0;i<arr.length; i++){
            arr[i] = my_string.charAt(i);
        }
        for(char x: arr){
            if(x!=letter.charAt(0))
                answer+=x;
        }
        return answer;
    }
}