//Write a Java program that:
//
//Stores the prices of 3 grocery items.
//
//Stores the quantities purchased for each item.
//
//Calculates the total cost of the bill.
//

public class Gorcey {
    public static void main ( String[] args){
//        declare variables
        double applePrice = 1000;
        double tp = 2000.0;
        double bread = 3500;

        int applepurchased = 50;
        int qtytp = 4;
        int qtybread =1;

        String x = Integer.toString(qtytp);


        System.out.println(x);


        double totalapple = (applePrice * applepurchased) + (tp*qtytp)+(bread*qtybread);


        System.out.println("Total Cost:" + totalapple );


    }
}
