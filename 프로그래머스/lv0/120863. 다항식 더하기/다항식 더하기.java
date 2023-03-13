class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int xSum = 0;
        int cSum = 0;
        for(int i=0; i<arr.length; i++){
            boolean x = arr[i].contains("x");
            if(x){
                if(arr[i].length()==1){
                    xSum += 1;
                } else{
                    String[] str = arr[i].split("x");
                    int a = Integer.parseInt(str[0]);
                    xSum += a;
                }
            } else {
                cSum += Integer.parseInt(arr[i]);
            }
        }
        if(cSum==0&&xSum==0){
            answer = "0";
        } else if(xSum==0){
            answer = cSum + "";
        } else if(cSum==0){
            if(xSum==1){
                answer = "x";
            } else{
                answer = xSum + "x";
            }
        } else {
            if(xSum==1){
                answer = "x + " + cSum;
            } else{
                answer = xSum + "x + " + cSum;
            }
            
        }
        
        return answer;
    }
}