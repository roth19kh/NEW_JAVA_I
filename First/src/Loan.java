import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        var cin = new Scanner(System.in);
        var date = LocalDate.now().plusMonths(1);
        var dateReceive = LocalDate.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        var df = new DecimalFormat("$#,##0.00");

        System.out.print("Enter Loan Amount $:");
        double loan = cin.nextDouble();

        System.out.print("Enter Interest Rate %:");
        double interestR = cin.nextDouble();

        System.out.print("Enter Number of Months:");
        int month = cin.nextInt();

        System.out.println("Date receive: "+dateReceive.format(dateFormatter));

        double interestRate = interestR/ 100;
        double installment = (loan * interestRate) / (1 - Math.pow(1 + interestRate, - month));
        double totalInstallment = 0;
        double remainingBalance = loan;
        double interestMoney=0;
        System.out.println("=========================================================");
        System.out.println("Month \t\t\t\tInstallment\t\tPrinciple\t\tInterest\t\tDebt Balance");
        for (int i = 0; i < month; i++) {
            double interest = remainingBalance * interestRate;
            double principal = installment - interest;
            totalInstallment += installment;
            remainingBalance -= principal;
            interestMoney += interest;

            System.out.println(date.plusMonths(i).format(dateFormatter)+ "\t\t\t"+df.format(installment)+"\t\t\t"+df.format(principal)+"\t\t\t"+df.format(interest)+"\t\t\t" +df.format(remainingBalance));
        }
        System.out.println("=========================================================");
        System.out.println("Total Installment: "+df.format(totalInstallment));
        System.out.println("Total Interest: "+df.format(interestMoney));
    }
}