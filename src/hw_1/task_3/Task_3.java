// 3. Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);

package hw_1.task_3;

public class Task_3 {
    public static void task_3() {
        for (int i = 2; i <= 1000; i++) {
            boolean numbers = true;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    numbers = false;
                    break;
                }
            }
            if (numbers)
                System.out.print(i + ", ");
        }
    }
}
