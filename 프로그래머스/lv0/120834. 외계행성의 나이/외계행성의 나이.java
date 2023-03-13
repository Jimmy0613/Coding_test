class Solution {
    public String solution(int age) {
        String answer = "";
        int bag=0; //백의 자리 숫자
        int ship=0; //십의 자리 숫자
        int ill=0; //일의 자리 숫자
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        if(age>=1000){
            return answer="baaa";
        } else if(age>=100){
            bag = age/100;
            ship = (age - bag*100)/10;
            ill = (age- bag*100-ship*10);
            return answer = arr[bag] + arr[ship] + arr[ill];
        } else if(age>=10){
            ship = (age - bag*100)/10;
            ill = (age- bag*100-ship*10);
            return answer = arr[ship] + arr[ill];
        } else {
            return answer = arr[age];
        }
    }
}