/**
 * Created by RedEYE on 23.12.2016.
 */

import static java.lang.Math.*;
import java.util.Scanner;

public class Forwhile_cycles {
    public static void main(String[] args) {
        System.out.printf("\nЗадание 1\n");
        for (int i = 100; i < 690; i+=5) {
            if ((i%100)*7==i)
                System.out.print(i);
        }

        System.out.printf("\nЗадание 2\n");
        int a = 1150;
        System.out.print(a + " " + 1 + " ");
        for (int i = 2; i < a; i++)
            if (a%i==0){
                a/=i;
                System.out.print(i + " ");
            }

        System.out.printf("\nЗадание 3\n");
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
        a = 100052;
        s = 0;
        while (a>0) {
            a/=10;
            s+=1;
        }
        System.out.print(s);

        System.out.printf("\nЗадание 8\n");
        a = 1000252;
        s = 0;
        while (a>0) {
            s+=a%10;
            a/=10;
        }
        System.out.print(s);

//        System.out.printf("\nЗадание 9\n");
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
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n++;
//        }
//        System.out.print(n-1);

//        System.out.printf("\nЗадание 12\n");
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n+=input;
//        }
//        System.out.print(n);

        System.out.printf("\nЗадание 13\n");
        n = 50;
        for (int i=1; i*i < n; i++)
            System.out.print(i*i + " ");

        System.out.printf("\nЗадание 14\n");
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
        n=257;
        a=2;
        while (a<257) {
            System.out.print(a + " ");
            a<<=1;
        }

        System.out.printf("\nЗадание 16\n");
        for (int i=1; i < n; i++)
            if (2*i>=n) {
                System.out.print(i);
                break;
            }

        System.out.printf("\nЗадание 17\n");
        float x = 10, y = 20;
        int day = 1;
        while (x < y) {
            x*=1.1;
            day+=1;
        }
        System.out.print(day);

        System.out.printf("\nЗадание 17\n");
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
//        System.out.printf("Введите данные\n");
//        n=0;
//        input=1;
//        while (input!=0) {
//            input = in.nextInt();
//            n+=input;
//        }
//        System.out.print(n);

        System.out.printf("\nЗадание 19\n");
        n = 3;
        sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=(1/fact(i));
        }
        System.out.print(sum);

        System.out.printf("\nЗадание 20\n");
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
