import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            list.add(a % 42);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int a : list) {
            if (!list2.contains(a)) {
                list2.add(a);
            }
        }
        bw.write(String.valueOf(list2.size()));
        bw.flush();
        br.close();
        bw.close();
    } 
}
