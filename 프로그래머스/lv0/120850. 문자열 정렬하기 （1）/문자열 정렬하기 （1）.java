import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<my_string.length();i++){
            if((int)my_string.charAt(i)>=48&&(int)my_string.charAt(i)<=57){
                String x = my_string.charAt(i)+"";
                list.add(Integer.parseInt(x));
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}