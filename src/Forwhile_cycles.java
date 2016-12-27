/**
 * Created by RedEYE on 23.12.2016.
 */

import static java.lang.Math.*;
import java.util.Scanner;

public class Forwhile_cycles {
    public static void main(String[] args) {

        System.out.printf("\nЗадание 1\n");
//        В трехзначном числе зачеркнули первую цифру, полученное число умножили на 7 и получили исходное число. Найдите его.
        for (int i = 100; i < 690; i+=5) {
            if ((i%100)*7==i)
                System.out.print(i);
        }

        System.out.printf("\nЗадание 2\n");
//        Для данного натурального числа n выведите на экран все его натуральные делители.
        int a = 1150;
        System.out.print(a + " ");
        for (int i = 1; i < a; i++)
            if (a%i==0){
                a/=i;
                System.out.print(i + " ");
            }

        System.out.printf("\nЗадание 3\n");
//        Число называется совершенным, если оно равно сумме своих делителей, не превосходящих его самого. Например, 6=1+2+3, 28=1+2+4+7+14.
//        Требуется найти все совершенные числа от M до N.
//        Ограничения: M и N целые, 1 <= M <= N <= 109, (N - M) * sqrt(N) <= 107.
        int m = 4, n = 30, s;
        for (int i = m; i < n; i++)
        {
            s=0;
            for (int j = 1; j < i-1; j++)
                if (i%j==0)
                    s+=j;
            if (i==s)
                System.out.print(i + " ");
        }

        System.out.printf("\nЗадание 4\n");
//        По данному действительному a и натуральному n вычислите an за время порядка log(n). Воспользуйтесь представлением числа n в двоичном виде, или свойством: an=(a2)n/2 при четном n, an=a×an-1 при нечетном n.
        a = 2;
        n = 5;
        int res = 1;

        while (n > 0){
            if (n%2 == 1)
                res *= a;
        a *= a;
        n/=2;
        }
        System.out.print(res);

        System.out.printf("\nЗадание 5\n");
//        Найдите наибольший общий делитель двух чисел не используя медленного оператора деления. Можно использовать деление на 2 и взятие остатка от деления на 2, поскольку они выполняются при помощи битовых операций быстро.
//                Указание: НОД(a,b)=2НОД(a/2,b/2),если a и b – четные, НОД(a,b)=НОД(a/2,b),если a – четное, b – нечетное, НОД(a,b)=НОД(a-b,b),если a и b – нечетные.
        int b = 1071;
        a = 462;
        int tmp;
                while (b !=0) {
                    tmp = a%b;
                    a = b;
                    b = tmp;
                }
        System.out.print(a);

        System.out.printf("\nЗадание 6\n");
//        Дано натуральное число, найти максимальную цифру.
        a=5568;
        n=a%10;
        while (a > 0) {
            a/=10;
            if (n < (a%10))
                n=a%10;
            if (n==9)
                break;
        }
        System.out.print(n);

        System.out.printf("\nЗадание 7\n");
//        Дано натуральное число, найти минимальную цифру.
        a=5568;
        n=a%10;
        do {
            a/=10;
            if (n > (a%10))
                n=a%10;
            if (n==1)
                break;
        } while (a > 9);
        System.out.print(n);

        System.out.printf("\nЗадание 7\n");
//        Дано натуральное число, найти количество цифр в числе.
        a = 100052;
        s = 0;
        while (a>0) {
            a/=10;
            s+=1;
        }
        System.out.print(s);

        System.out.printf("\nЗадание 8\n");
//        Дано натуральное число, найти сумму цифр.
        a = 1000252;
        s = 0;
        while (a>0) {
            s+=a%10;
            a/=10;
        }
        System.out.print(s);

//        System.out.printf("\nЗадание 9\n");
////        Вводится последовательность целых чисел, оканчивающаяся нулем. Определить максимальное.
        Scanner in = new Scanner(System.in);
//        System.out.printf("Введите данные\n");
//        n=0;
        int input;
//        do {
//            input = in.nextInt();
//            if (n < input)
//                n=input;
//        } while (input!=0);
//        System.out.print(n);
//
//        System.out.printf("\nЗадание 10\n");
////        Вводится последовательность целых чисел, оканчивающаяся нулем. Определить минимальное не равное нулю.
//        System.out.printf("Введите данные\n");
//        n=1;
//        input = 0;
//        do {
//            input = in.nextInt();
//            if ((input!=0) && (n > input))
//                n=input;
//        } while (input!=0);
//        System.out.print(n);

//        System.out.printf("\nЗадание 11\n");
////        Вводится последовательность целых чисел, оканчивающаяся нулем. Определить количество введенных чисел.
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n++;
//        }
//        System.out.print(n-1);

//        System.out.printf("\nЗадание 12\n");
////        Вводится последовательность целых чисел, оканчивающаяся нулем. Определить сумму введенных чисел.
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n+=input;
//        }
//        System.out.print(n);

        System.out.printf("\nЗадание 13\n");
//        Напечатайте все точные квадраты натуральных чисел, не превосходящие данного числа n. (например, при вводе 50 программа должна вывести 1 4 9 16 25 36 49).
        n = 50;
        for (int i=1; i*i < n; i++)
            System.out.print(i*i + " ");

        System.out.printf("\nЗадание 14\n");
//        Дано натуральное число n. Определите, является ли оно степенью числа 2, и выведите слово YES, если является и слово NO, если не является.
        n=4;
        if(n%2!=0)
            System.out.print("NO");
        else
        {
            while(n>2)
                n=n/2;
            if(n/2==1)
                System.out.print("YES");
            if(n%2!=0)
                System.out.print("NO");
        }

        System.out.printf("\nЗадание 15\n");
//        По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания. Операцией возведения в степень пользоваться нельзя!
        n=257;
        a=2;
        while (a<257) {
            System.out.print(a + " ");
            a<<=1;
        }

        System.out.printf("\nЗадание 16\n");
//        По данному натуральному числу N выведите такое наименьшее целое число k, что 2k>=N. Операцией возведения в степень пользоваться нельзя!
        for (int i=1; i < n; i++)
            if (2*i>=n) {
                System.out.print(i);
                break;
            }

        System.out.printf("\nЗадание 17\n");
//        В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена соsставит не менее y километров. Например, при вводе 10 20 программа должна вывести 9. x и y – действительные числа, ответ – целое число.
        float x = 10, y = 20;
        int day = 1;
        while (x < y) {
            x*=1.1;
            day+=1;
        }
        System.out.print(day);

        System.out.printf("\nЗадание 17\n");
//        В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который суммарный пробег спортсмена составит не менее y километров. Например, при вводе 10 100 программа должна вывести 8.
        x = 10;
        y = 100;
        float sum = x;
        day = 1;
        while (sum < y) {
            x*=1.1;
            day+=1;
            sum+=x;
        }
        System.out.print(day);

//        System.out.printf("\nЗадание 18\n");
////        Вводится последовательность целых чисел до тех пор, пока не будет введено число 0. После ввода числа 0 программа должна завершить свою работу и вывести сумму введенных чисел.
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n+=input;
//        }
//        System.out.print(n);

        System.out.printf("\nЗадание 19\n");
//        По данному натуральному числу n найдите сумму чисел 1+1/1!+1/2!+1/3!+...+1/n!. Количество действий должно быть пропорционально n. Напишите программу, которая считывает значение n и выводит результат в виде действительного числа. К чему будет стремиться эта сумма при росте числа n?
        n = 3;
        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=(1/fact(i));
        }
        System.out.print(sum);

        System.out.printf("\nЗадание 20\n");
//        По данному числу n выведите n-e число Фибоначчи. Использовать рекурсию нельзя.
        int f1 = 1, f2 = 1, fibsum = 0;
        n=10;
        for (int i = 2; i<n-1; i++)
        {
            fibsum = f1+f2;
            f1=f2;
            f2=fibsum;
        }
        System.out.print(fibsum);
    }
    static float fact(int n) {
        float fact;
        if (n==0)
            fact=1;
          else
              fact=fact(n-1)*n;
        return fact;
    }
}
