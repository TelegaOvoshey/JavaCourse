/**
 * Created by RedEYE on 23.12.2016.
 */
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Bit_operations {
    public static void main(String[] args) {

        System.out.printf("\nЗадание 1\n");
        byte n = 31;
        System.out.print(1 << n - 1);

        System.out.printf("\nЗадание 2\n");
        n = 2;
        byte m = 3;
        System.out.print((1 << (n)) + (1 << m));

        System.out.printf("\nЗадание 3\n");
        byte a = 7;
        int i = 2;

        a >>= i;
        a <<= i;
        System.out.print(a);

        System.out.printf("\nЗадание 4\n");
        a = 8;
        i = 2;
        a |= (1 << i);
        System.out.print(a);

        System.out.printf("\nЗадание 5\n");
        a = 12;
        i = 2;
        a ^= (1 << i);
        System.out.print(a);

        System.out.printf("\nЗадание 6\n");
        a = 7;
        i = 1;
        a &= (~(1 << i));
        System.out.print(a);

        System.out.printf("\nЗадание 7\n");
        a = 110;
        n = 4;
        a^=((a>>n)<<n);
        System.out.print(a);

        System.out.printf("\nЗадание 8\n");
        a = 7;
        n = 2;
        if ((a & (1 << i)) == 0)
            System.out.print(0);
        else
            System.out.print(1);

        System.out.printf("\nЗадание 9\n");
        char ch = 8;
        i = 128;

        while (true) {
            if ((ch & i) == 0)
                System.out.print(0);
            else
                System.out.print(1);
            if (i == 1)
                break;
            i >>= 1;
        }

        System.out.printf("\nЗадание 10\n");
        byte b = a = 0;
        int r;
        try{
            Scanner sc = new Scanner(new File("input.txt"));
            while(sc.hasNext()){
                a=sc.nextByte();
                b=sc.nextByte();}
            sc.close();
        } catch(FileNotFoundException e){e.printStackTrace();}

        try{
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.println(a+b);
            pw.close();} catch(Exception e){e.printStackTrace();}
    }
}
