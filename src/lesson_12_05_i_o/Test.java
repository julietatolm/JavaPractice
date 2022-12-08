package lesson_12_05_i_o;

import java.util.Random;
import java.util.Scanner;

//1. Написать программу, которая
//дает пользователю арифметическую задачу со случайными числами и проверяет ответ

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("Please, answer the question: " + a + " * " + + b + " = ?");

        System.out.println("Your answer: ");
        int c = sc.nextInt();
        if (c == a*b) {
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is wrong");
        }



    }
}
