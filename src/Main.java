
import java.util.Scanner;
//This is so that user input can be added, allowing for the user to input the bill, tax and the number of people
import java.text.DecimalFormat;
//The decimal format makes it so that everything is in decimal places or at least has them
class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        //Added to ensure that the decimal format is always with the two decimal places.
        System.out.print("Enter your bill($): ");
        double billAmount = scan.nextDouble();
        //In order to see the bill amount, the program scans the user's input and stores it in the database.
        double billRounded =((Math.floor(billAmount*100))/100);
        //The math.floor command is used to make everything come down to a whole number
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
        //This is the rounded down version into two decimal places, the math floor to get it to a whole number/integer and the *100 and the /100 to get the decimal places.
        //The tip percentage is divided by 100 in order to get it into a decimal value, which is then multiplied by the bill amount to see how much the tip desired will cost. This is then stored as a variable for further usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Tip Amount: $" + df.format(totalTipRounded));
        // the df.format is to make sure that it follows the format that is listed above with the double decimal places
        double totalBillCostRounded = (totalTipRounded + billRounded);
        //The total cost of the tip is added to the total cost of the bill in order to get the entire and final cost for all of the members to a pay an equal portion of. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Bill Cost: $" + df.format(totalBillCostRounded));
        double tipPerPerson = Math.floor((totalTipRounded/people)*100)/100;
        //The cost of the tips is divided by the number of people that there are in order to see how much every person will have to pay, presuming they all pay an equal share. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Tip Amount per Person: $" + df.format(tipPerPerson));
        double totalCostPerson = Math.floor((totalBillCostRounded / people) * 100) / 100;
        //The total cost of the tips per person is added to the total cost of the entire bill including tip, divided by people, in order to see what the fair, equal amount that every person has to pay is. This is then stored as a variable for future usage.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Bill Per Person: $" + df.format(totalCostPerson));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");


    }
}