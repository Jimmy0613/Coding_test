import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;
        int idx = 0;
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a > max) {
                max = a;
                idx = i;
            }
        }
        bw.write(String.format("%d\n", max));
        bw.write(String.format("%d", idx));
        bw.flush();
        br.close();
        bw.close();
    }
}
