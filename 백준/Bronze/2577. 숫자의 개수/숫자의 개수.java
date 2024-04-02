import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        long num = a * b * c;
        String s = String.valueOf(num);
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(s.substring(i, i+1));
            arr[n]++;
        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    } 
}
