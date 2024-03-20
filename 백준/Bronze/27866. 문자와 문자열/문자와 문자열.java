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
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(s.charAt(i - 1)));
        bw.flush();
        br.close();
        bw.close();
    }
}
