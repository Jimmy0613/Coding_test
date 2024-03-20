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
        if ("F".equals(s)) {
            bw.write("0.0");
        } else {
            char a = s.charAt(0);
            char b = s.charAt(1);
            float c = 69 - a;
            if (b == '+') {
                c += 0.3;
            } else if (b == '-') {
                c -= 0.3;
            }
            bw.write(String.valueOf(c));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
