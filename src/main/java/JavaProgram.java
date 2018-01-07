/**
 * Created by manjot on 6/1/18.
 */

import java.util.Scanner;

public class JavaProgram {
  /**
   *
   * @param args This is the main method.
   */

  public static void main(String []args) {
    float num1;
    float num2;
    float res;
    char choice;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.print("a. Addition\n");
      System.out.print("b. Subtraction\n");
      System.out.print("c. Multiplication\n");
      System.out.print("d. Division\n");
      System.out.print("e. Power\n");
      System.out.print("f. Absolute\n");
      System.out.print("g. Modulus\n");
      System.out.print("h. Maximum of 2 numbers\n");
      System.out.print("i. Minimum of 2 numbers\n");
      System.out.print("j. Exit\n\n");
      System.out.print("Enter Your Choice : ");
      choice = scan.next().charAt(0);
      switch (choice) {
        case 'a' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = num1 + num2;
          System.out.print("Result = " + res);
          break;
        case 'b' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = num1 - num2;
          System.out.print("Result = " + res);
          break;
        case 'c' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = num1 * num2;
          System.out.print("Result = " + res);
          break;
        case 'd' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = num1 / num2;
          System.out.print("Result = " + res);
          break;
        case 'e' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = (float)Math.pow((double)num1,(double)num2);
          System.out.print("Result = " + res);
          break;
        case 'f' :
          System.out.print("Enter a Number : ");
          num1 = scan.nextFloat();
          res = Math.abs(num1);
          System.out.print("Result = " + res);
          break;
        case 'g' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = num1 % num2;
          System.out.print("Result = " + res);
          break;
        case 'h' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = (num1 > num2) ? num1 : num2;
          System.out.print("Result = " + res);
          break;
        case 'i' :
          System.out.print("Enter Two Number : ");
          num1 = scan.nextFloat();
          num2 = scan.nextFloat();
          res = (num1 < num2) ?  num1 : num2;
          System.out.print("Result = " + res);
          break;
        case 'j' : System.exit(0);
          break;
        default : System.out.print("Wrong Choice!!!");
          break;
      }
      System.out.print("\n---------------------------------------\n");
    } while (choice != 5);
  }
}




