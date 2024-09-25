import java.text.DecimalFormat;
import java.util.Scanner;

public class OK {
    public static void main(String[] args) {
        System.out.println("សួស្តី លោកម៉ូយ កញ្ញាម៉ូយ");
        int a = 10;
        double b = 20.99;
        System.out.println("Values a= " + a + " and Values b= " + b);
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        double price = 5794385345.19216801;
        System.out.println("Price is " + df.format(price));


        String name;
        int age;
        DecimalFormat pf = new DecimalFormat("$#,##0.00");
        double amount;
        long id;

        Scanner cin = new Scanner(System.in);

        System.out.print("Input name =");
        cin.nextLine();
        name = cin.nextLine();
        System.out.print("Input age =");
        age = cin.nextInt();

        System.out.print("Input amount =");
        amount = cin.nextDouble();
        System.out.print("Input id =");
        id = cin.nextLong();
    }
}