class Solution {
    public int[] solution(int n) {
        int count = -1;
        int num = 1;
        if(n%2==0){
            count = n/2;
        } else {
            count = n/2 + 1;
        }
        int[] answer = new int[count];
        for(int i = 0; i < count; i++){
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
}