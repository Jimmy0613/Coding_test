class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int x: numbers){
            answer += x;
        }
        answer = answer/numbers.length; 
        return answer;
    }
}