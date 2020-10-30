
package debtpayment;

import java.util.Scanner;

class DebtPayment {

    public static void main(String[] args) {

        //initializing variables
        int[] month = new int[0];
        month[0]=1;
        int var=++month[0];
        System.out.println(var);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of debt: ");
        double debt = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interest = input.nextDouble();

        System.out.print("Enter the monthly payment: ");
        double monthPay = input.nextDouble();

        //calculate
        double monthInterest = debt * interest / 100 / 12;
        double startBalance = debt - (monthInterest + monthPay);
        double newBalance = startBalance + monthInterest - monthPay;

        if (newBalance < 0)
        {
            newBalance = startBalance - monthInterest;
        }

        if (monthInterest > monthPay)
        {
            System.out.println("Debt can never be paid off.");
        }

        //output table
        System.out.println("Month     Start Balance     Interest"
                + "     Paymanent     End Balance");

    }

}
