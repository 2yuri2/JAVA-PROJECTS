
package labactivity.labactivity;

//Dave Yuri I. Jimenez
//CITCS 1E

//import scanner
import java.util.Scanner;

public class LabActivity {
    public static void main(String[] args) {
        // Create a object scanner once
        Scanner myScanner = new Scanner(System.in);
        
        
        //Create a loop to get the binary value and ask user all over again.
        while(true){
            
            // ask the user
            System.out.print("Place a decimal number or type \"STOP\" to close the program: ");
            String userInput = myScanner.nextLine();
            
            // if user type STOP end the program.
           if(userInput.equalsIgnoreCase("STOP")){
               System.out.println("End Program");
               break;
           }
           
           // Convert userInput into integer
           int decimal = Integer.parseInt(userInput);
           
           // Stored the converted decimal into quotient variable
           int quotient = decimal;
           
           //Create an empty varaible this will serve as a storage of binary numbers;
           String binaryStorage = "";
           
           //Create a new loop
           // This loop will run until the quotient equal to zero
           while(quotient > 0){
               //This variable will get the modulo which 1 and 0
               int binary = quotient % 2;
               
               //Divide the quotient until it get 0
               int newQuotient = quotient / 2;
               
               //Print out the OUTPUTS:
               System.out.println("Test" + quotient + "/2= " + newQuotient + " r " + binary);
               
               //stored every binary then a new storage
               binaryStorage = binary + binaryStorage;
               
               //declare and stored the newQuotient to the quotient to stop the program
               quotient = newQuotient;
           }
           
           //Print the stored binary values
           System.out.println("Binary value:" + binaryStorage);
           System.out.println();
           
        }
        
        //Close scanner Object
        myScanner.close();
    }
}

