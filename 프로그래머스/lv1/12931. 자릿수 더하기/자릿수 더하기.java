import java.util.*;

public class Solution {
    public int solution(int n) {
        String nStr = n + "";
        int answer = 0;
        for(int i=0; i<nStr.length(); i++){
            answer += Integer.parseInt(nStr.substring(i,i+1));
        }
       
        

        return answer;
    }
}