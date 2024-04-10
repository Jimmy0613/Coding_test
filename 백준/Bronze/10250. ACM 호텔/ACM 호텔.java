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
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b, c;
            if (h == 1) {
                b = h;
                c = a;    
            } else {
                if (a%h == 0) {
                    b = h;
                    c = a/h;
                } else {
                    b = a%h;
                    c = a/h+1;
                }
            }
            if (c < 10) {
                bw.write(String.format("%d0%d", b, c));
            } else {
                bw.write(String.format("%d%d", b, c));
            }
            bw.write("\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    } 
}
