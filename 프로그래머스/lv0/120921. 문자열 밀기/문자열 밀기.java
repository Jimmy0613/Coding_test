import java.util.Arrays;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
		if (A.equals(B)) {
			return answer;
		}
		answer = -1;
		if (A.length() < 2) {
			return answer;
		}

		int count = 1;
		String aaa = A;
		char[] aa = A.toCharArray();
		while (count < A.length()) {
			char[] copy = aaa.toCharArray();
			for (int i = 0; i < aa.length; i++) {
				if (i == 0) {
					aa[0] = copy[copy.length - 1];
				} else {
					aa[i] = copy[i - 1];
				}
			}
			aaa = "";
			for (char x : aa) {
				aaa += x;
			}
			if (aaa.equals(B)) {
				return count;
			} else {
				count++;
			}
		}

		return answer;
    }
}