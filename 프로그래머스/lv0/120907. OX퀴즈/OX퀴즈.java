class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] a = quiz[i].split(" ");
            int b = Integer.parseInt(a[0]);
            if(a[1].equals("+")){
                b+=Integer.parseInt(a[2]);
            } else {
                b-=Integer.parseInt(a[2]);
            }
            if(Integer.parseInt(a[4])==b){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}