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
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf((a+b)*(a-b)));
        bw.flush();
        br.close();
        bw.close();
    }
}
