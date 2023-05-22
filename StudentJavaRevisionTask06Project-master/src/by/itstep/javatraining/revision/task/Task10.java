package by.itstep.javatraining.revision.task;

/*	Task 10. The Largest Sequence of Number Digits [наибольшая последовательность цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое наибольшее число подряд идущих
 *	цифр заданного числа равны друг другу. Если не нашлось ни одной пары, тройки
 *	и т.д. подряд идущих цифр, равных друг другу, то программа должна вывести число 1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[Sample function input 1]: 123456
 *	[Sample function output 1]: 1
 *
 *	[Sample function input 2]: 1234567789
 *	[Sample function output 2]: 2
 *
 *	[Sample function input 3]: 1122233335
 *	[Sample function output 3]: 4
 *
 *	[Sample function input 4]: 0
 *	[Sample function output 4]: 1
 *
 *	[Sample function input 5]: -15
 *	[Sample function output 5]: 1
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class Task10 {
    public static int task10(long number) {
        if (number < 0) {
            number = -number;
        } else if (number <= 10) {
            return 1;
        }

        ArrayList<Long> list = new ArrayList<>();
        ArrayList<Long> list2 = new ArrayList<>();

        long n;
        long count1 = 1;

        while (number > 0) {
            n = number % 10;
            list.add(n);
            number = number / 10;
        }

        for (int i = 1; i < list.size(); i++) {
            if (Objects.equals(list.get(i - 1), list.get(i))) {
                count1++;
            } else  {
                count1=1;
            }

            list2.add(count1);
        }

        Collections.sort(list2);
        Collections.reverse(list2);

        return (Math.toIntExact(list2.get(0)));
    }
}

