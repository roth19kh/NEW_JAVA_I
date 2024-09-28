import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumptionEDC {
    public static void main(String[] args) {
        var cin = new Scanner(System.in);

        double con,payment,oldIndex,newIndex;
        System.out.print("Enter Old Index: ");
        oldIndex = cin.nextDouble();
        System.out.print("Enter New Index: ");
        newIndex = cin.nextDouble();
        var df = new DecimalFormat("៛#,##0.00");

        if(oldIndex>=0 && oldIndex<=newIndex){
            con=newIndex-oldIndex;
            if(con<=50){
                payment=350*con;
            }
            else if(con<=150){
                payment= (con - 50)*650 + 50*350;
            }
            else {
                payment=(con - 150) * 950 + 100*650 + 50*350;
            }
            System.out.println("============================");
            System.out.println("Consumption is: " +con+ "kw/h");
            System.out.println("Payment is:     "+df.format(payment));
            System.out.println("============================");
        }
        else{
            System.err.println("Invalid input");
        }
    }
}
