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
        int[] arr = new int[8];
        String answer = "";
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                if (arr[i] > arr[i - 1]) {
                    if(i == 1) {
                        answer = "ascending";
                    } else {
                        if ("descending".equals(answer)) {
                            answer = "mixed";
                            break;
                        }
                    }
                } else {
                    if(i == 1) {
                        answer = "descending";
                    } else {
                        if ("ascending".equals(answer)) {
                            answer = "mixed";
                            break;
                        }
                    }
                }
            } 
        }
        bw.write(answer);
        bw.flush();
        br.close();
        bw.close();
    } 
}
