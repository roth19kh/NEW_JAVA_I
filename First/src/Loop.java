import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int sum = 0 ,sumb =0,n;
        String odd="",even="";
        Scanner cin = new Scanner(System.in);
        System.out.print("Please inter number=");
        n = cin.nextInt();


        for(int i = 1; i <= n; i++) {
            sum += 2 * i-1;
            sumb += 2 * i;

            odd += 2*i +" + ";
            even += 2*i-1 +" + ";
        }
        System.out.println(even+"\b\b= "+sum);
        System.out.println(odd+"\b\b= "+sumb);
    }
}