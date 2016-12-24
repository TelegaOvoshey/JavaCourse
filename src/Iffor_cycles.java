/**
 * Created by RedEYE on 23.12.2016.
 */

import static java.lang.Math.*;
import java.util.Scanner;

public class Iffor_cycles {
    public static void main(String[] args) {
        System.out.printf("\nЗадание 1\n");
        int a = 2, b = 1;
        if (a > b)
            System.out.print(a);
        else
            System.out.print(b);

        System.out.printf("\nЗадание 2\n");
        b = 2;
        if (a > b)
            System.out.print(1);
        else if (a < b)
            System.out.print(2);
        else
            System.out.print(0);

        System.out.printf("\nЗадание 3\n");
        int c = 3;
        if (a >= b)
            if (c <= b)
                System.out.print(a);
            else System.out.print(c);
        else if (c <= b)
            System.out.print(b);
        else System.out.print(c);

        System.out.printf("\nЗадание 4\n");
        int x = -5;
        if (x > 0)
            System.out.print(1);
        else if (x == 0)
            System.out.print(0);
        else System.out.print(-1);

        System.out.printf("\nЗадание 5\n");
        if (a == b)
            if (b == c)
                System.out.print(3);
            else System.out.print(2);
        else if (a == c || b == c)
            System.out.print(2);
        else System.out.print(1);

        System.out.printf("\nЗадание 6\n");
        int a1 = 2, b1 = 1, a2 = 6, b2 = 1;
        if ((a1 == a2) || (b1 == b2)) System.out.print("YES");
        else System.out.print("NO");

        System.out.printf("\nЗадание 7\n");
        if (sqrt(b) - 4 * a * c > 0)
            System.out.print(-b - sqrt(sqrt(b) - 4 * a * c) / (2 * a) + " " + -b + sqrt(sqrt(b) - 4 * a * c) / (2 * a));
        else if (sqrt(b) - 4 * a * c == 0)
            System.out.print(-b / (2 * a) + "b");

        System.out.printf("\nЗадание 8\n");
        a = 3;
        b = 4;
        c = 5;
        int bisector = 0, cath1 = 0, cath2 = 0;
        if ((a + b <= c) || (a + c <= b) || (b + c <= a))
            System.out.print("impossible");
        else if (a >= b)
            if (a >= c) {
                bisector = a;
                cath1 = b;
                cath2 = c;
            } else {
                bisector = c;
                cath1 = a;
                cath2 = b;
            }
        else if (c >= b) {
            bisector = c;
            cath1 = a;
            cath2 = b;
        } else {
            bisector = b;
            cath1 = a;
            cath2 = c;
        }
        cath1 *= cath1;
        cath2 *= cath2;
        bisector *= bisector;
        if (cath1 + cath2 > bisector)
            System.out.print("acute");
        else if (cath1 + cath2 < bisector)
            System.out.print("obtuse");
        else
            System.out.print("rectangular");

        System.out.printf("\nЗадание 9\n");
        int bilet = 0, bilet10 = 0, bilet60 = 0, n = 129;
        bilet60 = n / 60;
        n %= 60;
        if (n >= 35)
            bilet60++;
        else {
            bilet10 = n / 10;
            n %= 10;
            if (n >= 9)
                bilet10++;
            else
                bilet = n;
        }
        System.out.printf(bilet + " " + bilet10 + " " + bilet60);

        System.out.printf("\nЗадание 10\n");
        int bilet20 = 0, bilet5 = 0;
        bilet = 0;
        bilet10 = 0;
        bilet60 = 0;
        n = 129;

        bilet60 = n / 60;
        n %= 60;
        if (n >= 35)
            bilet60++;
        else {
            bilet20 = n / 20;
            n %= 20;
            if (n >= 18)
                bilet20++;
            else {
                bilet10 = n / 10;
                n %= 10;
                if (n >= 9)
                    bilet10++;
                else {
                    bilet5 = n / 5;
                    n %= 5;
                    if (n >= 4)
                        bilet5++;
                    else {
                        bilet = n;
                    }
                }
            }
        }
        System.out.printf(bilet + " " + bilet5 + " " + bilet10 + " " + bilet20 + " " + bilet60);//что с одинаковой стоимостью?

        System.out.printf("\nЗадание 11\n");
        n = 2;
        int sum = 0;
        for (int i = 0; i < n + 1; i++)
            sum = sum + i * i;
        System.out.print(sum);

        System.out.printf("\nЗадание 12\n");
        n = 3;
        sum = 0;
        for (int i = 1; i < n + 1; i++)
            sum += (n - 1) * n;
        System.out.print(sum);

        System.out.printf("\nЗадание 13\n");
        n = 3;
        sum = 0;
        for (int i = 1; i < n + 1; i++)
            for (int j = 1; j <= i; sum += j++) ;
        System.out.print(sum);

        System.out.printf("\nЗадание 14\n");
        a = 3;
        b = 10;
        for (int i = a; i <= b; i++)
            if (i % 2 == 0)
                System.out.printf(i + " ");

        System.out.printf("\nЗадание 15\n");
        sum = 1;
        n = 5;
        for (; n > 0; sum *= n--) ;
        System.out.print(sum);

        System.out.printf("\nЗадание 16\n");
        n = 5;
        int k = 2;
        sum = 1;
        for (int i = 1; i <= k; i++) {
            sum *= (n - k + i);
            sum /= i;
        }
        System.out.print(sum);

        System.out.printf("\nЗадание 17\n");
        n = 2;
        a = 3;
        System.out.print(pow(a, n));

        System.out.printf("\nЗадание 18\n");
        n = 4;
        for (int i = 1; i <= n; i++) {
            sum += (1 / pow(i, 2));
        }
        System.out.print(pow(a, n));

        System.out.printf("\nЗадание 19\n");
        n = 100;
        double s = 1;
        for (int i = 1; i <= n; i++) {
            s += pow(-1, i) / (2 * i + 1);
        }
        System.out.print(s * 4);

        System.out.printf("\nЗадание 20\n");
        System.out.printf("Без формулы геометрической прогрессии\n");
        sum = 1;
        a = 6;
        n = 5;
        for (int i = 1; i < n; i++)
            sum += pow(a, i);
        System.out.print(sum);
        System.out.printf("\nС формулой геометрической прогрессии\n");
        s = (pow(a, n) - 1) / (a - 1);
        System.out.print(s);

//        System.out.printf("\nЗадание 21\n");
//        Scanner in = new Scanner(System.in);
//        System.out.printf("\nВведите данные\n");
//        n=in.nextInt();
//        sum=0;
//        for (int i=0;i<n;i++)
//        {
//            sum+=in.nextInt();
//        }
//        System.out.print(sum);

        System.out.printf("\nЗадание 22\n");
        for (int i = 10; i < 99; i++) {
            if (i == 2 * (i % 10) * (i / 10))
                System.out.print(i);
        }

        System.out.printf("\nЗадание 23\n");
        for (int i = 100; i < 1000; i++) {
            if (i*i%1000==i)
                System.out.print(i);
        }
    }

    static double pow(double a, double n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return pow(a*a, n/2);
        return a*pow(a, n-1);
    }
}
