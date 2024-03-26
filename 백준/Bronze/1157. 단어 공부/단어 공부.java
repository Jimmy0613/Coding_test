import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        try {
            String s = (st.nextToken()).toUpperCase();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) { 
                    c = Character.toUpperCase(c);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
            char max = '?';
            int maxCnt = 0;
            for (char key : map.keySet()) {
                int cnt = map.get(key);
                if (cnt > maxCnt) {
                    max = key;
                    maxCnt = cnt;
                } else if (cnt == maxCnt) {
                    max = '?';
                }
            }
            bw.write(max);
        } catch (Exception e) {
            bw.write("?");
        }
       
        bw.flush();
        br.close();
        bw.close();
    } 
}
