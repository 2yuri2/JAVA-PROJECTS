import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String binaryString = "";
        while (true) {
            
            System.out.println("Enter a decimal number");
            String decimalNumberString = sc.nextLine();
            System.out.println("Number is: " + decimalNumberString);
            
            int binary = Integer.parseInt(decimalNumberString) % 2;
            int quotnt = Integer.parseInt(decimalNumberString) / 2;
            binaryString = binary + binaryString;
            System.out.println("Test: " + quotnt + " r " + binary);
            
            binary = quotnt % 2;
            quotnt = quotnt / 2;
            binaryString = binary + binaryString;
            System.out.println("Test: " + quotnt + " r " + binary);
            
            binary = quotnt % 2;
            quotnt = quotnt / 2;
            binaryString = binary + binaryString;
            System.out.println("Test: " + quotnt + " r " + binary);
            
            binary = quotnt % 2;
            quotnt = quotnt / 2;
            binaryString = binary + binaryString;
            
            System.out.println("Test: " + quotnt + " r " + binary);
            
            
            System.out.println("Test: " + binaryString);
        }
    }
}