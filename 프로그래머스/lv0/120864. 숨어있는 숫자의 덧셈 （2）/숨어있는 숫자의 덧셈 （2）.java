class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "a";
        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)>=48 && (int)my_string.charAt(i)<=57){
                for(int j=i; j<my_string.length(); j++){
                    if((int)my_string.charAt(j)<48||(int)my_string.charAt(j)>57){
                        if(j==i+1){
                            answer += (my_string.charAt(i) - '0');
                        } else if(j==i+2){
                            answer += (my_string.charAt(i)-'0')*10;
                            answer += (my_string.charAt(i+1)-'0');
                        } else if(j==i+3){
                            answer += (my_string.charAt(i)-'0')*100;
                            answer += (my_string.charAt(i+1)-'0')*10;
                            answer += my_string.charAt(i+2)-'0';
                        } else if(j==i+4){
                            answer += 1000;
                        }
                        i = j + 1;
                    }
                }
                
            } else if(i==my_string.length()-1)
                return 0;
        }
        return answer;
    }
}