class Solution {
    public int solution(int order) {
        int answer = 0;
        String os = order+"";
        for(int i=0; i<os.length(); i++){
            char x = os.charAt(i);
            if(x=='3'||x=='6'||x=='9')
                answer++;
        }
        return answer;
    }
}