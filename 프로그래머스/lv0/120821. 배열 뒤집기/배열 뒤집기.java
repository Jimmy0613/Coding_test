class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int num = 1;
        for(int i = 0; i<answer.length; i++){
            answer[i] = num_list[num_list.length - num];
            num++;
        }
        return answer;
    }
}