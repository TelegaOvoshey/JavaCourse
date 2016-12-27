/**
 * Created by RedEYE on 23.12.2016.
 */

import java.util.*;

import static java.lang.Math.*;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr1;

        System.out.printf("\nЗадание 1\n");
//        Выведите на экран все элементы массива с четными индексами
//        (то есть A[0], A[2], A[4], ...).
        int n = 10;
        arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = (int) (random() * n);
        showarr(arr1);
        System.out.print("\nЧетные индексы\n");
        for (int i = 0; i < n; i += 2) {
            System.out.print("arr1[" + i + "]:" + arr1[i] + " ");
        }

        System.out.printf("\n\nЗадание 2\n");
//        Выведите на экран все четные элементы массива (то есть те элементы, которые являются четными числами).
        System.out.print("\nЧетные элементы\n");
        for (int i = 0; i < n; i += 2) {
            if (arr1[i] % 2 == 0)
                System.out.print("arr[" + i + "]:" + arr1[i] + " ");
        }

        System.out.printf("\n\nЗадание 3\n");
//        Найдите количество положительных элементов в массиве. Программа должна считать массив и вывести единственное число – количество положительных элементов в массиве.
        int[] arr2;
        arr2 = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr2[i] = ((int) (random() * 31) - 15);
            if (arr2[i] >= 0)
                sum++;
        }
        showarr(arr2);
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 4\n");
//        Дан массив. Найдите количество элементов массива, которые больше предыдущего элемента в этом массиве.
        showarr(arr1);
        System.out.print("\n");
        for (int i = 1; i < n; i++) {
            if (arr1[i] > arr1[i - 1])
                System.out.print("arr[" + i + "]:" + arr1[i] + " ");
        }

        System.out.printf("\n\nЗадание 5\n");
//        Массив содержит только ненулевые числа. Определите, есть ли в данном массиве два соседних элемента с одинаковыми знаками. Программа должна вывести YES, если есть два числа с одинаковыми знаками и NO иначе.
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            do {
                arr2[i] = ((int) (random() * 21) - 10);
            } while (arr2[i] == 0);
        }
        for (int i = 0; i < n - 1; i++) {
            if ((arr2[i] > 0 && arr2[i + 1] > 0) || (arr2[i] < 0 && arr2[i + 1] < 0)) {
                bool = true;
            }
        }
        showarr(arr2);
        if (bool == true)
            System.out.print("\nYES");
        else
            System.out.print("\nNO");

        System.out.printf("\n\nЗадание 6\n");
//        Дан массив. Определите, сколько в этом массиве элементов, которые строго больше обоих своих соседей.
        showarr(arr2);
        sum = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((arr2[i] > arr2[i + 1]) && (arr2[i] > arr2[i - 1])) {
                sum++;
            }
        }
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 7\n");
//        ан массив. Переставьте элементы массива в обратном порядке без использования дополнительного массива. Программа должна считать массив, поменять порядок его элементов, вывести результат на экран (просто вывести элементы массива в обратном порядке – недостаточно!).
        showarr(arr2);
        int swap;
        for (int i = 1; i < (n / 2); i++) {
            swap = arr2[n - i];
            arr2[n - i] = arr2[i - 1];
            arr2[i - 1] = swap;
        }
        showarr(arr2);

        System.out.printf("\n\nЗадание 8\n");
//        Переставьте соседние элементы массива (0-й элемент поменять с 1-м, 2-й с 3-м и т.д. Если элементов нечетное число, то последний элемент остается на своем месте)
        showarr(arr2);
        for (int i = 0; i < n - 1; i += 2) {
            swap = arr2[i];
            arr2[i] = arr2[i + 1];
            arr2[i + 1] = swap;
        }
        ;
        System.out.print("\n");
        showarr(arr2);

        System.out.printf("\n\nЗадание 9\n");
//        Циклически сдвиньте элементы массива вправо (0-й элемент становится 1-м, 1-й становится 2-м, ..., последний становится 0-м, то есть массив {3, 5, 7, 9} превращается в массив {9, 3, 5, 7}).
        showarr(arr1);
        swap = arr1[n - 1];
        for (int j = (n - 1); j > 0; j--) {
            arr1[j] = arr1[j - 1];
        }
        arr1[0] = swap;
        System.out.print("\n");
        showarr(arr1);

        System.out.printf("\n\nЗадание 10\n");
//        Найдите значение наибольшего элемента в массиве.
        showarr(arr1);
        int max = arr1[0];
        for (int j = 1; j < n; j++) {
            if (arr1[j] > arr1[j - 1])
                max = arr1[j];
        }
        System.out.print("\n" + max);

        System.out.printf("\n\nЗадание 11\n");
//        Дан массив, отсортированный по возрастанию (каждый элемент массива не меньше предыдущего элемента, например, {1, 2, 2, 3, 3, 3}). Найдите количество различных чисел в этом массиве.
        Arrays.sort(arr1);
        showarr(arr1);
        sum = 0;
        for (int i = 0; i < n; i++)
            if (swap != arr1[i]) {
                swap = arr1[i];
                sum++;
            }
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 12\n");
//        Сложить две дроби Даны две рациональные дроби: a/b и c/d. Сложите их и результат представьте в виде несократимой дроби m/n. Программа получает на вход 4 натуральных числа a, b, c, d, не превосходящих 100. Программа должна вывести 2 натуральных числа m и n такие, что m/n=a/b+c/d и дробь m/n – несократима.
        int a, b, c, d, m1, n1, nod;
        a = 20;
        b = 12;
        c = 5;
        d = 35;
        n1 = b * d;
        m1 = a * d + c * b;
        nod = NOD(m1, n1);
        n1 /= nod;
        m1 /= nod;
        System.out.print("m/n=" + m1 + "/" + n1);

        System.out.printf("\n\nЗадание 13\n");
//        Алгоритм Евклида. По данным натуральным числам n и m найдите их наибольший общий делитель. Числа m и n не превосходят 109. Количество действий должно быть порядка log max (n;m). Указание. НОД(n,m)=НОД(n mod m,m).
        a = 18;
        b = 81;
        nod = NOD(a, b);
        System.out.print(nod);

        System.out.printf("\n\nЗадание 14\n");
//        Разложение на простые множители. Напишите программу, которая по данному натуральному числу n печатает все его простые натуральные делители с учетом кратности, то есть при вводе числа 132 программа должна вывести 2 2 3 11. Время работы программы должно быть пропорционально корню из n.
        a = 1150;
        System.out.print(a + " " + 1 + " ");
        for (int i = 2; i < a; i++)
            if (a % i == 0) {
                a /= i;
                System.out.print(i + " ");
            }

        System.out.printf("\n\nЗадание 15\n");
//        Теорема Лагранжа утверждает, что любое натуральное число можно представить в виде суммы четырех точных квадратов. По данному числу n найдите такое представление: напечатайте от 1 до 4 натуральных чисел, квадраты которых дают в сумме данное число (то есть при вводе 7 программа должна вывести 2 1 1 1).
        Langrange(5);

        System.out.printf("\n\nЗадание 16\n");
        Goldbach(14);
//        Гипотеза Гольдбаха (недоказанная до сих пор) утверждает, что любое четное число (кроме 2) можно представить в виде суммы двух простых чисел. Для данного четного n>2 напечатайте его представление в виде суммы двух простых.


    }

    static void Goldbach (int a) {
        if (a%2==0) {
            for (int i=1; i<=(a/2); i++)
                if(IsPrime(i)&&IsPrime(a-i))
                    System.out.print(i + "+" + (a-i) + " ");
        }
    }

    static boolean IsPrime (int n) {
        byte coin = 0;
        for (int i = 1; i < n; i++)
            if (n%i==0){
                n/=i;
                coin++;
            }
        return (coin==1);
    }

    static void Langrange (int a) {
            int i=a;
            do {
                if ((i*i)<=a)
                    if ((i*i)==a) {
                        System.out.print(i + " ");
                }
                    else
                        {
                            System.out.print(i + " ");
                            Langrange(a-(i*i));
                        }
                        i--;
            } while (i>1);
    }

    static void showarr(int[] arr) {
        int n = arr.length;
        System.out.print("Весь массив\n");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]:" + arr[i] + " ");
        }
    }

    static int NOD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static ArrayList<Integer> primefactor(int number) {
        ArrayList<Integer> primearray = new ArrayList<>();
        int factor = 2;
        while (number > 1 && factor * factor <= number) {
            while (number % factor == 0) {
                primearray.add(factor);
                number /= factor;
            }
            ++factor;
        }
        if (number > 1) {
            primearray.add(number);
        }
        return primearray;
    }
}
