package by.itstep.javatraining.revision.task;

/*	Task 09. The Count of Local Maximus [количество локальных максимумов]
 *
 *	Элемент последовательности называется локальным максимумом,
 *	если он строго больше предыдущего и последующего элемента
 *	последовательности. Первый и последний элемент последовательности
 *	не являются локальными максимумами по определению.
 *	Дано целое число. Необходимо подсчитать количество строгих локальных
 *	максимумов среди цифр заданного числа.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено количество строгих локальных максимумов.
 *
 *	[ input 1]: 2414241
 *	[output 1]: 3
 *
 *	[ input 2]: 131131
 *	[output 2]: 2
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -13245
 *	[output 4]: 1
 *
 *	[ input 5]: 12345
 *	[output 5]: 0
 */

import java.util.ArrayList;

public class Task09 {
    public static int task09(long number) {
        if (number < 100 && number > -100) {
            return 0;
        } else if (number < -100) {
            number = -number;
        }

        ArrayList<Long> list = new ArrayList<>();

        long n;
        int count = 0;
        while (number > 0) {
            n = number % 10;
            list.add(n);
            number = number / 10;
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i) > (list.get(i - 1)) && (list.get(i + 1) < (list.get(i))))) {
                count++;
            }
        }
        return count;
    }
}