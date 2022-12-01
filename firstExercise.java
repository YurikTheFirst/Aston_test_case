package Aston_test_case;

import java.util.Scanner;

public class firstExercise {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите требуемое число: ");

        int num1 = scan.nextInt();
        int num2 = 7;

        if (num1 > num2) {
            System.out.print("Привет");
        } else {
            System.out.print("Неверно");
        }

    }
}


