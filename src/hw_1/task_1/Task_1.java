// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),

package hw_1.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void task_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int triangularNumber = number * (number + 1) / 2;
        System.out.println(triangularNumber);
    }
}