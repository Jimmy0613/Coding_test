import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] arr1 = before.split("");
        String[] arr2 = after.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(!arr1[i].equals(arr2[i]))
                return 0;
        }
        return 1;
    }
}