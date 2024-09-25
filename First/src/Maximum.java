import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Maximin");
        Scanner cin = new Scanner(System.in);

        int max;

        System.out.print("Enter the number 1: ");
        int n1 = cin.nextInt();
        System.out.print("Enter the number 2: ");
        int n2 = cin.nextInt();
        System.out.print("Enter the number 3: ");
        int n3 = cin.nextInt();
        System.out.print("Enter the number 4: ");
        int n4 = cin.nextInt();
        System.out.print("Enter the number 5: ");
        int n5 = cin.nextInt();

        System.out.println("---------------------------------");
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            max = n1;
            System.out.println("Maximum number is:" + max);
        }
        else if (n2>n3 && n2 > n4 && n2 > n5){
            max = n2;
            System.out.println("Maximum number is:" + max);
        }
        else if (n3>n4 && n3 > n5){
            max = n3;
            System.out.println("Maximum number is:" + max);
        }
        else if (n4 > n5){
            max = n4;
            System.out.println("Maximum number is:" + max);
        }
        else {
            max = n5;
            System.out.println("Maximum number is:" + max);
        }

    }
}
