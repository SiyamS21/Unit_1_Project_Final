import java.util.Scanner;
import java.text.DecimalFormat;  // this class helps with rounding

public class Main {
    public static DecimalFormat d = new DecimalFormat("0.00");    // this line helps set the format for the decimals to round to so in this case this makes it round to the nearest hundredth
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the total bill: ");
        String bill = s.nextLine();                                       // getting the total bill from the user using a scanner
        double totalBill = Double.parseDouble(bill);
        System.out.println();
        System.out.print("Please enter the tip percentage: ");
        String percentage = s.nextLine();                                 // getting the tip percentage from the user using a scanner
        int tipPercentage = Integer.parseInt(percentage);
        System.out.println();
        System.out.print("Please enter the number of people in your party: ");
        String p = s.nextLine();                                                // getting the amount of people in the party from the user using a scanner
        int people = Integer.parseInt(p);
        System.out.println();
        double totalTip = (totalBill * ((double) tipPercentage / 100));  // multiplied the total bill by the tip percentage divided by 100 in order to get the amount of tip
        double totalBillWithTip = totalBill + totalTip;
        double tipPerPerson = totalTip / people;
        double billWithTipPerPerson = totalBillWithTip / people;
        System.out.println("=====================================================================");      // simply used to divide the inputs before from the new data that the application calculated
        System.out.println();
        System.out.println("The total amount of tip altogether is " + d.format(totalTip) + ".");
        System.out.println();
        System.out.println("The total amount of bill AND tip altogether is " + d.format(totalBillWithTip) + ".");
        System.out.println();
        System.out.println("The total amount of tip PER person is " + d.format(tipPerPerson) + ".");
        System.out.println();
        System.out.println("The total amount of bill AND tip PER person is " + d.format(billWithTipPerPerson) + ".");
    }
}