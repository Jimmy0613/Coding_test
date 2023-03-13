class Solution {
    public int[] solution(String[] strlist) {
        int l = strlist.length;
        int[] answer = new int[l];
        for(int i = 0; i<l; i++){
            int x = strlist[i].length();
            answer[i] = x;
        }
        return answer;
    }
}