class Solution {
    public String solution(String my_string, int n) {
        char[] arr = new char[my_string.length()];
        for(int i=0;i<arr.length; i++){
            arr[i] = my_string.charAt(i);
        }
        String answer = "";
        for(int i=0;i<arr.length; i++){
            for(int j=1; j<=n; j++){
                answer+=arr[i];
            }
        }
        
        return answer;
    }
}