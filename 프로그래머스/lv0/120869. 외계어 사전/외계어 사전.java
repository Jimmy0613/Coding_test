class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length; i++){
            answer = 1;
            for(int j=0; j<spell.length;j++){
                if(!dic[i].contains(spell[j])){
                    answer=2;
                    break;
                }
            }
            if(answer==1)
                break;
            
        }
        return answer;
    }
}