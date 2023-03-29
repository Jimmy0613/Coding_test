import java.util.ArrayList;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<babbling.length; i++){
            String[] arr  = babbling[i].split("aya|ye|woo|ma");
            if(arr.length==0){
                answer++;
            }
        }
        
        return answer;
    }

}

