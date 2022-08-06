import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner; 
import java.util.Arrays ;
// import java.util.NumberFormat;
public class okay {
public static void main (String[]args) {
    // simple loan calculator here
    final byte TotalMonths = 12 ;
    final byte percentage = 100;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal:");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate:");
    float annualInterestRate = scanner.nextFloat();
    float monthlyInterest = annualInterestRate / percentage / TotalMonths ;
    
    System.out.print("Period(Years):");
    byte years = scanner.nextByte();
    int numberOfPayments = years * TotalMonths ;

    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest , numberOfPayments)) 
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) -1 );

    String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.print("Your mortgage is :" + mortgageFormat);             


    
}
}