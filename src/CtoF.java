import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        // variable declarations
        int inputtedCTemp = 0; // var to store input
        int tempInF = 0; // var which is outputted
        String trash = ""; // var if user makes a mistake
        boolean range = false; //var to check if input is valid
        Scanner in = new Scanner(System.in); // sets up scanner class
       do {
           System.out.print("Enter temperature in Celsius: "); // prompt to user
           if(in.hasNextInt()) // checks if input is integer
           {
               inputtedCTemp = in.nextInt(); //stores input in var
               in.nextLine(); // clears buffer
               range = true; // valid input
           }
           else
           {
               trash = in.nextLine(); // stores input
               System.out.println("Must enter valid value for temperature in Celsius: " + trash); // tells user what their mistake was.
           }
       }while (range == false); // repeats if input was invalid

        tempInF = ((inputtedCTemp*9)/5) + 32; //  finds the conversion of C into F
        System.out.println(inputtedCTemp + " Degrees Celsius in Fahrenheit is " + tempInF + " Degrees."); // outputs the conversions
    }
}
