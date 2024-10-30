import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoanII {
    public static void main(String[] args) {
        double loan,interestRate;
        int month;
        Scanner cin = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        System.out.print("Enter Loan           =$");
        loan = cin.nextDouble();
        System.out.print("Enter Interest Rate  =%");
        interestRate = cin.nextDouble();
        System.out.print("Enter Month          = ");
        month = cin.nextInt();
        System.out.println("Date Received      = "+date.format(dtf));


        interestRate /=100;
        double installment,interest,debt=loan;
        double principal =loan / month;
        double totalInstallment =0;

        installment = (loan * interestRate) / (1 - Math.pow((1 + interestRate), -month));
        System.out.println("");
        System.out.println(MyText.padRight("Month", 15)+
                MyText.padRight("Installment", 18)+
                MyText.padRight("Principal", 15)+
                MyText.padRight("Interest", 15)+
                MyText.padRight("Debt Balance", 15)
        );
        for(int i=1;i<=month;i++){
            interest = debt * interestRate;
            installment = principal + interest;
            debt -= principal;

            if(i==month){
                DecimalFormat f= new DecimalFormat("0.00");
                double pr = Double.parseDouble(f.format(principal));
                double inter = Double.parseDouble(f.format(interest));

                installment = pr + inter;
                debt = 0;
            }

            System.out.println(
                    MyText.padRight(date.plusMonths(i).format(dtf), 15, '-')+
                            MyText.padRight(df.format(installment), 18, '-')+
                            MyText.padRight(df.format(principal), 15, '-')+
                            MyText.padRight(df.format(interest), 15, '-')+
                            MyText.padRight(df.format(debt), 15, '-')
            );
            totalInstallment += installment;
        }
        System.out.println("============================================================");
        installment = (loan * interestRate) / (1 - Math.pow((1 + interestRate), -month));

        double totalInterest = (loan * interestRate) * (month + 1) / 2;

        System.out.println("Total Installment         ="+df.format(totalInstallment));
        System.out.println("Total Interest            ="+df.format(totalInterest));
    }
}