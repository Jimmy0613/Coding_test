import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += st.nextToken();
        }
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i + 1)) * Integer.parseInt(s.substring(i, i + 1));
        }
        bw.write(String.valueOf(answer % 10));
        bw.flush();
        br.close();
        bw.close();
    }
}
