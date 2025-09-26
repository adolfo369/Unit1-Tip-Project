
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill($): ");
        double billAmount = scan.nextDouble();
        double billRounded =((Math.floor(billAmount*100))/100);
        //The user is required to input the cost of their bill, which is then stored as the "billAmount" variable for future usage.
        System.out.print("Enter tip percentage: ");
        double tipAmount = scan.nextDouble();
        double tipRounded = ((Math.floor(tipAmount*100))/100);
        //The user is required to input the tip percentage required, which is then stored as the "tipAmount" variable for future usage.
        System.out.print("Enter how much people there are: ");
        int people = scan.nextInt();
        double peopleRounded = ((Math.floor(people*100))/100);
        //The user is required to input the total number of people present which is then stored as the "people" variable for future usage.
        double totalTipAmount = (tipAmount/100) * (billAmount);
        double totalTipRounded = ((Math.floor(totalTipAmount*100))/100);
        System.out.println(totalTipRounded);
        //The tip percentage is divided by 100 in order to get it into a decimal value, which is then multiplied by the bill amount to see how much the tip desired will cost. This is then stored as a variable for further usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Tip Amount: $" + totalTipRounded);
        double totalBillCostRounded = (totalTipRounded + billRounded);
        //The total cost of the tip is added to the total cost of the bill in order to get the entire and final cost for all of the members to a pay an equal portion of. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Bill Cost: $" + totalBillCostRounded);
        double tipPerPerson = (Math.floor(totalTipRounded/people)*100)/100;
        System.out.println(tipPerPerson);
        //The cost of the tips is divided by the number of people that there are in order to see how much every person will have to pay, presuming they all pay an equal share. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Tip Amount per Person: $" + tipPerPerson);
        double totalCostPerson = (tipPerPerson) + (totalBillCostRounded/people);
        //The total cost of the tips per person is added to the total cost of the entire bill including tip, divided by people, in order to see what the fair, equal amount that every person has to pay is. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Bill Per Person: $" + totalCostPerson);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");


    }
}