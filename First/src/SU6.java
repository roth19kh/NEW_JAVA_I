import java.text.DecimalFormat;
import java.util.Scanner;

public class SU6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double p1, p2, p3,dis,total,disPrice,payment;
        System.out.print("Enter the price 1:$");
        p1 = cin.nextDouble();
        System.out.print("Enter the Price 2:$");
        p2 = cin.nextDouble();
        System.out.print("Enter the Price 3:$");
        p3 = cin.nextDouble();
        System.out.print("Enter the Discount(%):");
        dis = cin.nextDouble();
        total = p1 + p2 + p3;
        disPrice = total * dis/100;
        payment = total - disPrice;
        DecimalFormat df =new DecimalFormat("$#,##0.00");

        System.out.println("_________________________________________");
        System.out.println("The total is"+df.format(total));
        System.out.println("The discount price is"+df.format(disPrice));
        System.out.println("The payment is"+df.format(payment));
        System.out.println("_________________________________________");

    }
}
