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
        int t = Integer.parseInt(st.nextToken());
        int max = -1000000;
        int min = 1000000;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < t; i++) {
            int r = Integer.parseInt(st.nextToken());
            if (r > max) {
                max = r;
            }
            if (r < min) {
                min = r;
            }
        }
        bw.write(String.format("%d %d", min, max));
        bw.flush();
        br.close();
        bw.close();
    }
}
