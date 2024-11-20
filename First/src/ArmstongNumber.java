import java.util.Scanner;

public class ArmstongNumber {
    public static void main(String[] args) {
        var cin = new Scanner(System.in);
        String allNum = "";
        System.out.print("Input number: ");
        int num = cin.nextInt();
        for (int j = 0; j <= num; j++){
            int n = j;
            int digit = (n + "").length();
            char[] ch = (n + "").toCharArray();
            int sum = 0;
            for (char c : ch) {
                    sum += Math.pow(c - 48, digit);
                    if (sum == n){
                        allNum += "Armstrong number:" + sum +"\n" ;
                    }
            }
        }
        System.out.println(allNum);
    }
}
