import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var cin = new Scanner(System.in);
        var date = LocalDate.now().plusMonths(1);
        var dateReceive = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        var df = new DecimalFormat("$#,##0.00");

        System.out.print("Enter Loan Amount: ");
        double loan = cin.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double interestR = cin.nextDouble();

        System.out.print("Enter Number of Months: ");
        int month = cin.nextInt();

        double interestRate = interestR/ 100;
        System.out.println("Date receive: "+dateReceive.format(formatter));
        double installment = (loan * interestRate) / (1 - Math.pow(1 + interestRate, - month));


        double totalInstallment = 0.0;
        double totalInterest = 0.0;
        double remainingBalance = loan;
        System.out.println("\n"+"Month \t\t\t\tInstallment\t\tPrinciple\t\tInterest\t\tDebt Balance");
        for (int i = 0; i <= month-1; i++) {

            double interest = remainingBalance * interestRate;
            double principal = installment - interest;
            totalInstallment += installment;
            totalInterest += interest;
            remainingBalance -= principal;

            System.out.println("Date: " + date.plusMonths(i).format(formatter)+ "\t"+df.format(installment)+"\t\t\t"+df.format(principal)+"\t\t\t"+df.format(interest)+"\t" +df.format(remainingBalance));
        }
        System.out.println("Installment: "+df.format(totalInstallment));
    }
}