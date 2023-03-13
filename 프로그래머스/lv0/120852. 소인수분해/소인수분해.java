import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        //ArrayList로 하는 이유: 배열은 길이 한번 설정하면 못바꿔서.. 다른 방법? 몰러..
        ArrayList<Integer> arr = new ArrayList<>();
        //n의 약수
        int a = 1;
        while(true){
            //2부터 판정
            a++;
            //나머지가 0이면(약수이면)
            ii: if(n%a==0){
               
                for(int i=0; i<arr.size();i++){
                     //앞에 추가된 애들(2나 3 등등)로 나눠 떨어진다는 소리는 소인수가 아니라는 뜻
                    if(a%arr.get(i)==0)
                        break ii;
                }
                //아니면 추가해줌
                arr.add(a);
            }
            //n까지 돌리고 같으면 while문 빠져나옴 break
            if(a==n)
                break;
        }
        //answer 배열로 옮겨주기 끝
         int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}