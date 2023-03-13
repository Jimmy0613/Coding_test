class Solution {
    public String solution(String my_string) {
        //아스키코드 대문자: 65~90, 소문자: 97~122 (차이: 32)
        //즉.. 대문자에 32를 더하면 소문자 되고 소문자에 32 빼면 대문자 된다.
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)<=90){
                answer += (char)((int)my_string.charAt(i) + 32);
            } else {
                answer += (char)((int)my_string.charAt(i) - 32);
            }
        }
        return answer;
    }
}