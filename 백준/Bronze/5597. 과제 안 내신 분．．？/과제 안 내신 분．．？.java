import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[30];
        StringTokenizer st;
        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr[n - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                bw.write(String.format("%d\n", i + 1));
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
