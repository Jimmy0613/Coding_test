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
        String a = st.nextToken();
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            String s = String.valueOf(x);
            if (s.toUpperCase().equals(s)) {
                bw.write(s.toLowerCase());
            } else {
                bw.write(s.toUpperCase());
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
