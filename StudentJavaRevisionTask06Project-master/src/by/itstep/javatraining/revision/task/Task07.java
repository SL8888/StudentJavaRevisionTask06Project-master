package by.itstep.javatraining.revision.task;

/*	Task 07. The Double Max [вторая максимальная цифра]
 *
 *	Дано целое число. Необходимо определить вторую по величине цифру данного числа,
 *	т.е. цифру, которая будет наибольшим, если из числа удалить наибольшую цифру.
 *	Если нет такой цифры, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 12345
 *	[output 1]: 4
 *
 *	[ input 2]: -56789
 *	[output 2]: 8
 *
 *	[ input 3]: 11111
 *	[output 3]: -1
 *
 *	[ input 4]: 0
 *	[output 4]: -1
 */

import java.util.ArrayList;
import java.util.Collections;

public class Task07 {
    public static int task07(long number) {

        if (number <= -10) {
            number = -number;
        } else if (number < 10) {
            return -1;
        }

        ArrayList<Long> list = new ArrayList<>();

        while (number > 0) {
            long n = number % 10;
            list.add(n);
            number /= 10;
        }

        Collections.sort(list);
        Collections.reverse(list);

        int count = 1;
        for (int j = 1; j < list.size(); j++) {
            if (list.get(0).equals(list.get(j))) {
                count++;
            }
        }
        return (count == list.size()) ? -1 : Math.toIntExact(list.get(count));
    }
}

