import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //"input.nextInt()" was changed to "keyboard.nextInt()" after the former failed to compile and returned error: "cannot find symbol."
    //"input.nextDouble()" was changed to keyboard.nextDouble()" after the former failed to compile and returned error: "cannot find symbol."

    System.out.println("Please enter the first whole number you would like to add.");
    num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    num3 = keyboard.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    dub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    dub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    dub3 = keyboard.nextDouble();

    int sumInteger = num1 + num2 + num3;
    double sumDouble = dub1 + dub2 + dub3;

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sumInteger);
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sumDouble);
  }
}
