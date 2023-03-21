class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int x = str2.length();
        if(str1.length()<str2.length())
            return 2;
        for(int i=0; i<=str1.length()-x; i++){
            if((str1.substring(i, i+x)).equals(str2)){
                return answer = 1;
            }
        }
        return answer;
    }
}