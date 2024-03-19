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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        
        for (int cnt = 1; cnt <=2; cnt++ ){
            for (int i = 0; i<n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j<m; j++) {
                    if (cnt == 1) {
                        a[i][j] = Integer.parseInt(st.nextToken());
                    } else {
                        b[i][j] = Integer.parseInt(st.nextToken());
                        bw.write(String.format("%d ", a[i][j] + b[i][j]));
                    }
                }
                bw.flush();
            }
        }
        br.close();
        bw.close();
    }
}
