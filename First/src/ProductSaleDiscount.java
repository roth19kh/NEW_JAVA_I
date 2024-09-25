import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductSaleDiscount {
    public static void main(String[] args) {
        var cin = new Scanner(System.in);
        int dis;
        double p1, p2, p3, amount, disPrice=0, payment;
        System.out.print("Enter the price of the product 1:$");
        p1 = cin.nextDouble();
        System.out.print("Enter the price of the product 2:$");
        p2 = cin.nextDouble();
        System.out.print("Enter the price of the product 3:$");
        p3 = cin.nextDouble();
        var df = new DecimalFormat("$#,##0.00");
        amount = p1 + p2 + p3;
        if (p1 > 0 && p2 > 0 && p3 > 0) {
            if (amount < 1) {
                dis=0;
            } else if (amount <= 50) {
                dis=5;
            } else if (amount <= 150) {
                dis=10;
            } else {
                dis =15;
            }
            disPrice = amount * dis / 100;
            payment = amount - disPrice;
            System.out.println("Amount is:" + df.format(amount));
            System.out.println("Discount :" +dis + "%");
            System.out.println("Discount price is:" + df.format(disPrice));
            System.out.println("Payment is :" + df.format(payment));
        } else {
            System.err.print("Invalid input");
        }
    }
}