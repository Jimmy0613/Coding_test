import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String answer = "int";
        for(int i = 1; i<=a/4; i++){
            answer = "long " + answer;
        }
        System.out.println(answer);
    }
}