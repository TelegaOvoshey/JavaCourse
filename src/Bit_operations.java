/**
 * Created by RedEYE on 23.12.2016.
 */
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Bit_operations {
    public static void main(String[] args) {

        System.out.printf("\nЗадание 1\n");
//        Дано число n<32. Запишите число 2 n , то есть число, у которого n-й бит равен 1,
//        а остальные – нули.
        byte n = 31;
        System.out.print(1 << n - 1);

        System.out.printf("\nЗадание 2\n");
//        Даны два неравных числа: n и m, не превосходящие 31. Вычислите 2^ n +2 ^m .
        n = 2;
        byte m = 3;
        System.out.print((1 << (n)) + (1 << m));

        System.out.printf("\nЗадание 3\n");
//        Дано целое число A и натуральное число i. Обнулите у числа A его младшие i
//        бит и выведите результат
        byte a = 7;
        int i = 2;
        a >>= i;
        a <<= i;
        System.out.print(a);

        System.out.printf("\nЗадание 4\n");
//        Дано целое число A и натуральное число i. Выведите число, которое получается
//        из числа A установкой значения i-го бита равному 1
        a = 8;
        i = 2;
        a |= (1 << i);
        System.out.print(a);

        System.out.printf("\nЗадание 5\n");
//        Дано целое число A и натуральное число i. Выведите число, которое получается
//        из числа A инвертированием i-го бита.
        a = 12;
        i = 2;
        a ^= (1 << i);
        System.out.print(a);

        System.out.printf("\nЗадание 6\n");
//        Дано целое число A и натуральное число i. Выведите число, которое
//        получается из числа A установкой значения i-го бита равному 0.
        a = 7;
        i = 1;
        a &= (~(1 << i));
        System.out.print(a);

        System.out.printf("\nЗадание 7\n");
//        Дано целое число A и натуральное число n. Выведите число, которое состоит
//        только из n младших бит числа A (то есть обнулите все биты числа A, кроме младших n).
        a = 110;
        n = 4;
        a^=((a>>n)<<n);
        System.out.print(a);

        System.out.printf("\nЗадание 8\n");
//        Дано целое число A и натуральное число i. Выведите значение i-го бита числа
//        A, то есть 0 или 1.
        a = 7;
        n = 2;
        if ((a & (1 << i)) == 0)
            System.out.print(0);
        else
            System.out.print(1);

        System.out.printf("\nЗадание 9\n");
//        Дано число типа unsigned char, то есть от 0 до 255. Выведите его в битовой
//        форме: 8 бит, старшие биты слева, младшие – справа, не используя представление
//        bitset.
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
//        Программа должна читать данные из файла input.txt и выводить результат в файл
//        output.txt . Пробельными символами называются символы пробела, табуляции,
//                перехода на новую строку. Непробельными символами называются все остальные
//        символы, чьи ASCII-коды не меньше 20h. Словом называется последовательность
//        непробельных символов, разделенных пробельными символами.
//        1. Сумма
//        Входной файл содержит два целых числа. Запишите в выходной файл их сумму.
//        A+B
//        Требуется сложить два целых числа А и В.
//        Входные данные
//        В единственной строке входного файла INPUT.TXT записано два натуральных числа
//        через пробел, не превышающих 10 в 9 степени .
//                Выходные данные
//        В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое
//        число — сумму чисел А и В.
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
