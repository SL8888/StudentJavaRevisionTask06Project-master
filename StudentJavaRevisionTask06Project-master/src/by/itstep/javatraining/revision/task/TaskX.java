package by.itstep.javatraining.revision.task;

/*	Task X. Unique Number Digits [уникальные цифры числа]
 *
 *	Дано целое число. Необходимо определить, все ли цифры числа уникальны,
 *	т.е. среди цифр числа нет повторяющихся.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено булевское значение - результат решения задания.
 *
 *	[ input 1]: 12345
 *	[output 1]: true
 *
 *	[ input 2]: 54321
 *	[output 2]: true
 *
 *	[ input 3]: 11111
 *	[output 3]: false
 *
 *	[ input 4]: 121
 *	[output 4]: false
 *
 *	[ input 5]: -12345
 *	[output 5]: true
 *
 *	[ input 6]: 0
 *	[output 6]: true
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class TaskX {
    public static boolean taskX(long number) {

        if (number < 0) {
            number = -number;
        } else if (number < 11) {
            return true;
        }

        ArrayList<Long> list = new ArrayList<>();

        while (number > 0) {
            long n = number % 10;
            list.add(n);
            number /= 10;
        }

        Collections.sort(list);

        int count = 1;
        for (int j = 1; j < list.size(); j++) {
            if (Objects.equals(list.get(j - 1), list.get(j))) {
                count++;
            }
        }
        return (count <= 1);
    }
}

