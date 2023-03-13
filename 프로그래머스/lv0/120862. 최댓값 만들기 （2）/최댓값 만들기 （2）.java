import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int pMax = 0; //양수 곱 중 최댓값
        int mMax = 0; //음수 곱 중 최댓값
        if(numbers.length==2){
            return answer = numbers[0]*numbers[1];
        }
        Arrays.sort(numbers); //일단 냅다 오름차순 정렬
        int plusIndex = -1; //양수가 되는 때의 인덱스 구함
        for(int i = 0 ; i<numbers.length; i++){
            if(numbers[i]>=0)
                plusIndex = i;
        }
        
            mMax = numbers[0]*numbers[1];
            pMax = numbers[numbers.length-1]*numbers[numbers.length-2];
            if(mMax>pMax)
                return mMax;
            else return pMax;
      
    }
}