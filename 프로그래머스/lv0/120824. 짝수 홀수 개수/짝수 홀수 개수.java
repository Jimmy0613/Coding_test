class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        for(int x: num_list){
            if(x%2 == 0){
                a++;
            } else {
                b++;
            }
        }
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}