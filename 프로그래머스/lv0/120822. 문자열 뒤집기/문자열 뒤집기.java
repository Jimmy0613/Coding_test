class Solution {
    public String solution(String my_string) {
        String answer = "";
		char[] arr = new char[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			arr[i] = my_string.charAt(i);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			answer+=arr[i];
		}
		return answer;
    }
}