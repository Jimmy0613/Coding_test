import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int c = 0;
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0; i<my_string.length();i++){
            c=0;
            if(arr.size()!=0){
                for(char x : arr){
                    if(my_string.charAt(i)==x){
                        c=1;
                        break;
                    }
                }
            }
            if(c==0){
                arr.add(my_string.charAt(i));
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}