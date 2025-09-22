
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill($): ");
        double billAmount = scan.nextDouble();
        System.out.print("Enter tip percentage: ");
        double tipAmount = scan.nextDouble();
        System.out.print("Enter how much people there are: ");
        int people = scan.nextInt();
        double totalTipAmount = (tipAmount/100) * (billAmount);
        System.out.println(" - - - - - - - - - - - - - - - -");
        System.out.println("|Total Tip Amount: $" + totalTipAmount + "            |");
        double totalBillCost = (totalTipAmount + billAmount);
        System.out.println("Total Bill Cost: $" + totalBillCost);
        double tipPerPerson = (totalTipAmount/people);
        System.out.println("Total Tip Amount per Person: $" + tipPerPerson);
        double totalCostPerson = (tipPerPerson + (totalBillCost/people));
        System.out.println("Total Bill Per Person: $" + totalCostPerson);


    }
}