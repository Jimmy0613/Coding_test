class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] a = {lines[0][0], lines[0][1]};
        int[] b = {lines[1][0], lines[1][1]};
        int[] c = {lines[2][0], lines[2][1]};
        int minStart = Math.min(Math.min(a[0],b[0]),c[0]);
        int maxEnd = Math.max(Math.max(a[1],b[1]),c[1]);
        int count = 0;
        for(int i=minStart; i<maxEnd; i++){
            count = 0;
            for(int j=0; j<lines.length; j++){
                if(lines[j][0]<=i && lines[j][1]>=i+1){
                    count++;
                }
            }
            if(count>=2){
                answer++;
            }
        }
        
        return answer;
    }
}