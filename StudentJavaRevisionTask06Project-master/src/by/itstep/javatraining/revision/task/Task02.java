package by.itstep.javatraining.revision.task;

/*	Task 02. An Exact Power of Two [точная степень двойки]
 *
 *	Дано целое число. Необходимо определить,
 *	является ли данное число точной степенью двойки.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено булевское значение - ответ на задание.
 *
 *	[ input 1]: 32
 *	[output 1]: true
 *
 *	[ input 2]: 1
 *	[output 2]: true
 *
 *	[ input 3]: 0
 *	[output 3]: false
 *
 *	[ input 4]: 30
 *	[output 4]: false
 *
 *	[ input 4]: -4
 *	[output 4]: false
 */

public class Task02 {
    public static boolean task02(int number) {

        if (number < 1) {
            return false;
        }
        if (number == 1) {
            return true;
        }

        int n = 2;
        while (number >= n) {
            n *= 2;
        }
        return (n % number == 0);
    }
}


//        while (number >= (int) Math.pow(2, n)) {
//            if (number % ((int) Math.pow(2, n)) == 0) {
//                return true;
//            } else n++;



