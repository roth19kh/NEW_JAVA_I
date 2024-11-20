import java.util.Scanner;

public class ArrayExcercide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,count=0;

        System.out.print("Enter number = ");
        n = scanner.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Height["+ i +"] = ");
            h[i] = scanner.nextInt();
        }
        for (int i = 0; i < h.length; i++) {
            if (i==0 && h[i] >= h[i + 1]) {
                count++;
            } else if (i == h.length - 1 && h[i] >= h[i - 1]) {
                count++;
            } else if (i>0&&i<=h.length - 1 && h[i]>= h[i - 1] && h[i] >= h[i + 1]) {
                count++;
            }
        }
        System.out.println("Number count:" + count);
    }
}
