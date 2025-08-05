import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] size = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < size.length; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int tBundleSize = Integer.parseInt(st.nextToken());
        int penBundleSize = Integer.parseInt(st.nextToken());

        int tBundle = 0;
        for (int s : size) {
            if (s > 0 && s <= tBundleSize) {
                tBundle++;
            } else {
                tBundle += s / tBundleSize;

                if (s % tBundleSize != 0) {
                    tBundle++;
                }
            }
        }

        bw.write(String.format("%d\n", tBundle));

        if (n < penBundleSize) {
            bw.write(String.format("%d %d", 0, n));
        } else {
            bw.write(String.format("%d %d", n / penBundleSize, n % penBundleSize));
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
