import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int start = (int) 'a'; // a의 아스키코드
        int[] arr = new int[26];
        for (int i=0; i< arr.length; i++) {
            arr[i] = -1;
        }
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            int idx = (int) c - start;
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }
        for(int a : arr) {
            bw.write(String.format("%d ", a));
        }
        
        bw.flush();
        br.close();
        bw.close();
    } 
}
