package Aston_test_case;

import java.util.Scanner;
public class thirdExercise {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println ("Введите значение длинны массива: ");

        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Введите значение каждого элемента массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
           if (array[i] % 3 == 0) {
               System.out.println("Значения, кратные 3: " + array[i]);
           }
        }

    }
    }
