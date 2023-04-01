// 4. Реализовать простой калькулятор

package hw_1.task_4;

import java.util.Scanner;

public class Task_4 {
    public static void task_4() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();
        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Делить на 0 нельзя");
                    return;
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            }
            default -> System.out.println("Попробуйте еще раз");
        }
    }
}
