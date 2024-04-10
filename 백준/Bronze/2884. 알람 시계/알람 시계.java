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
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (m >= 45) {
            m -= 45;
        } else if (m < 45) {
            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
            m += 15;
        }
        bw.write(String.format("%d %d", h, m));

        bw.flush();
        br.close();
        bw.close();
    } 
}
