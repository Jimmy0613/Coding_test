import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : numlist){
            if(a%n==0){
                list.add(a);
            }
        }
        return list;
    }
}