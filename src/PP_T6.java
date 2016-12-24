/**
 * Created by RedEYE on 23.12.2016.
 */
import java.util.*;

public class PP_T6 {
//    public static void main(String[] args) {
//
//        System.out.printf("\nЗадание 1\n");
//        int min;
//        long t1, t2;
//        int[] num = new int[4];
//        Scanner in = new Scanner(System.in);
//        System.out.printf("\nВведите данные\n");
//        for (int i=0; i<num.length; i++)
//            num[i]=in.nextInt();
//
//        t1=System.nanoTime();
//        min=min(num[0],num[1],num[2],num[3]);
//        System.out.print("\n"+min);
//        t2=System.nanoTime();
//        System.out.print("\nВремя 1:"+(t2-t1));
//
//        t1=System.nanoTime();
//        int a, n;
//
//        min=min1(num);
//        System.out.print("\n"+min+"\n");
//        t2=System.nanoTime();
//        System.out.print("Время 2:"+(t2-t1));
//
//        System.out.printf("\nЗадание 2\n");
//        System.out.printf("Введите число и его степень\n");
//        a=in.nextInt();
//        n=in.nextInt();
//        System.out.print(pow(a,n));
//
//        System.out.printf("\nЗадание 3\n");
//
//
//
//        System.out.printf("\nЗадание 7\n");
//        Readln(a);
//        d:=a;
//        f:=1;
//        Repeat
//        a:=a div 10;          {находим разрядность числа(10,100,1000 и т.д.)}
//        f:=f*10;
//        until
//        a<10;
//        a:=0;
//        Repeat
//        b:=d mod 10;
//        d:=d div 10;
//        a:=a+b*f;
//        f:=f div 10;
//        Until d=0;
//        writeln('искомое число=',d);
//        readln
//                end
//
//        System.out.printf("\nЗадание 9\n");
//    }
//
//    static int min1(int [] arr) {
//        ArraysEx.sort(arr);
//        return arr[0];
//    }
//    static int min(int a, int b, int c, int d)
//    {
//        if ((a<b)&(a<c)&(a<d))
//            return a;
//        else if ((b<c)&(b<d))
//            return b;
//        if (c<d) return c;
//        else
//            return d;
//    }
//
//    static double pow(double a, double n) {
//        if (n == 0) return 1;
//        if (n % 2 == 0) return pow(a * a, n / 2);
//        return a * pow(a, n - 1);
//    }
//
//    static boolean XOR(boolean b1, boolean b2) {
//        return (b1&&!b2)||(!b2&&b1);
//    }
//    double Pow(int value, int pow)
//    {
//        if (pow==0)
//            return 1;
//        if (pow>0)
//            return Pow(value, pow-1) * value;
//        return 1.0/Pow(value, -pow);
//    }
}
