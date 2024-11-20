import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,9};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n======================================");
        for(int v :a){
            System.out.print(v + " ");
        }
        for(int v : a){
            System.out.println(v);
        }
        System.out.println("=====================");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }

        var cin = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = cin.nextInt();
        var b = new int[n];
        for(int i=1;i<= b.length ;i++){
            System.out.print("["+i+"] = ");
            b[i] = cin.nextInt();
        }
    }
}
