class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length() < n){
            answer = new String[1];
            answer[0] = my_str;
            return answer;
        } else if(my_str.length()%n==0){
            answer = new String[my_str.length()/n];
        } else {
            answer = new String[my_str.length()/n + 1];
        }
        for(int i=0; i<answer.length && my_str.length()>0; i++){
            if(my_str.length()<n){
                answer[i] = my_str;
            } else {
                answer[i] = my_str.substring(0,n);
            my_str = my_str.substring(n); 
            }
            
        }
        return answer;
    }
}