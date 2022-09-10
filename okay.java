import java.text.NumberFormat;
import java.util.*;
import java.util.Scanner;
import cu.Customer;
import java.util.Arrays;

public class okay {
    public static void main(String[] args) {
        Customer Maktech = new Customer("Yaqub Tawab", 290878089);
        Maktech.checkbalance();
        Maktech.Withdraw(2000);
        Maktech.deposit(4000);
    }
}