// 2. n! (произведение чисел от 1 до n)

package hw_1.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void task_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
