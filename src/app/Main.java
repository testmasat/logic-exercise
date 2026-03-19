package app;

import java.util.Scanner;

import model.Number;
import service.NumberService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        Number number = new Number(input);

        NumberService service = new NumberService();

        boolean result = service.isEven(number);

        if (result) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        scanner.close();
    }
}