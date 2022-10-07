import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // User Input for Info
        System.out.print("Enter total bill: ");
        double totalBillCost = scan.nextDouble();
        System.out.print("Enter tip percentage: ");
        int tipPercentage = scan.nextInt();
        System.out.print("Enter number of people: ");
        int numPeople = scan.nextInt();

        // Creation of TipCalculator object
        TipCalculator tip = new TipCalculator(numPeople, tipPercentage);

        // Variable Calculations
        tip.addMeal(totalBillCost);
        double totalBill = (double) Math.round((tip.totalBill()) * 100) / 100;
        double tipPer = (double) Math.round((tip.perPersonTipAmount()) * 100) / 100;
        double costPer = (double) Math.round((tip.perPersonTotalCost()) * 100) / 100;

        // Output with Calculated Values
        System.out.println("Total Bill (with tip): $" + totalBill);
        System.out.println("Tip Per Person: $" + tipPer);
        System.out.println("Total Per Person: $" + costPer);

    }
}