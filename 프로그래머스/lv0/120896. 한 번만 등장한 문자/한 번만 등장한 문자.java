import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        if(s.length()<2){
            return s;
        }
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    list.add(arr[i]);
                }
            } else if(i==arr.length-1){
                if(arr[i-1]!=arr[i]){
                    list.add(arr[i]);
                }
            } else if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        for(char x: list){
            answer += x;
        }
        return answer;
    }
}