import java.util.Scanner;
import java.lang.Math;


class main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
  
    int x = reader.nextInt();

    // add two numbers
    double value = 100*Math.pow(x, 4) + 2*Math.pow(x, 2) + 5*Math.pow(x, 1) - 4.0;
    System.out.println("The sum is: " + value);
  }
}