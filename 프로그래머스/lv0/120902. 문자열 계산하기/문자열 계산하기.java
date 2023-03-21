class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        for(int i = 0; i<arr.length; i++){
            if(i==0){
                answer += Integer.parseInt(arr[0]);
            } else if(i%2==0){
                switch(arr[i-1]){
                    case "+":
                        answer += Integer.parseInt(arr[i]);
                        break;
                    case "-":
                        answer -= Integer.parseInt(arr[i]);
                        break;
                }
            }
        }
        return answer;
    }
}