class Solution {
	public int solution(int[] array) {
        //입력1:[1, 2, 3, 3, 3, 4]
        //입력2:[1, 1, 2, 2]
		int answer = 0;//최빈값
		int count = 0;//각 원소의 개수를 세기 위한 변수
		if (array.length < 2) answer = array[0];
        else {
			//카운트 담기 위한 배열
            int[] copy = new int[array.length];
            
            //주어진 배열을 이중for문으로 돌려서 하나씩 카운트하기
			for (int i = 0; i < array.length; i++) {
				count = 0; 
				for (int j = 0; j < array.length; j++) {
					if (array[i] == array[j])
						count++;
				}
				copy[i] = count;
			}
            //완성된 copy1:[1, 1, 3, 3, 3, 1]
            //완성된 copy2:[2, 2, 2, 2]
			int max = copy[0];
			answer = array[0];
			for (int i = 0; i < array.length; i++) {
				if (copy[i] > max) {
					max = copy[i];
					answer = array[i];
				}
			}
            
			int maxcount = 0;// max가 몇개인지 세기 위함
            
            //max(최빈값)가 몇개인지 세는 for문..
			for (int i = 0; i < array.length; i++) {
				if (copy[i] == max) {
					maxcount++;
				}
                if (maxcount > max) {
                    answer = -1;
                    break;
                }
			}
			
		} 
		return answer;
	}
}