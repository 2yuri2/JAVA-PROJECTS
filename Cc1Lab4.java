
package com.mycompany.cc1lab4;

import java.util.Scanner;

public class Cc1Lab4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Do you want to convert decimal to bit?(Y/N): ");
            
            String userAns = myScanner.nextLine();
            
            if(userAns.equalsIgnoreCase("Y")){
                int userDecimal = myScanner.nextInt();
                System.out.print("Place a decimal number: ");
        
            } else if(userAns.equalsIgnoreCase("N")){
                System.out.print("Program will now close");
                break;
            }
          
        }
    }
}
