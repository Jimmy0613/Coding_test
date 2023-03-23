import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        //65~90 32
        char[] arr = my_string.toCharArray();
        for(int i=0; i<arr.length; i++){
            if((int)arr[i]<=90){
                arr[i] = (char)((int)arr[i] + 32);
            }
        }
        Arrays.sort(arr);
        for(char x: arr){
            answer+=x;
        }
        return answer;
    }
}