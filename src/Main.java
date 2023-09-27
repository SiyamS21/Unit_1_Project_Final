import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the total bill: ");
        String bill = s.nextLine();
        double totalBill = Double.parseDouble(bill);
        System.out.println();
        System.out.print("Please enter the tip percentage: ");
        String percentage = s.nextLine();
        int tipPercentage = Integer.parseInt(percentage);
        System.out.println();
        System.out.print("Please enter the number of people in your party: ");
        String p = s.nextLine();
        int people = Integer.parseInt(p);
        System.out.println();
        double totalTip = ();
        double totalBillWithTip = totalBill + totalTip;
        double tipPerPerson = totalTip / people;
        double billWithTipPerPerson = totalBillWithTip / people;
    }
}