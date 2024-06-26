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
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String[] arr = s.split("X");
            int grade = 0;
            for (String a : arr) {
                for (int j = 0; j < a.length(); j++) {
                    grade += j + 1;
                }
            }
            bw.write(String.format("%d\n", grade));
        }
        
        bw.flush();
        br.close();
        bw.close();
    } 
}
