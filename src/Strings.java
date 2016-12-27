import java.io.*;
import java.util.*;

public class Strings {
    public static void main(String[] args) {

        System.out.printf("\nЗадание 1\n");
        //Выведите на экран все возможные символы с ASCII-кодами от 32 до 255 и их ASCII-коды (символы с кодами до 32 являются служебными и их вывод на экран может привести к забавным последствиям). Формат вывода: сначала ASCII-код, затем символ
        for (char i = 32; i < 255; i++)
            System.out.print((int)i + " " + i + " \n");

//        System.out.printf("\nЗадание 2\n");
//        Напишите функцию bool IsDigit(unsigned char c), определяющую, является ли данный символ цифрой или нет. Напишите программу, которая получает на вход один символ и выводит строку yes, если символ является цифрой и строку no, в противном случае.
        Scanner in = new Scanner(System.in);
//        System.out.printf("Введите данные\n");
//        if (IsDigit(in.next().charAt(0)))
//            System.out.print("YES");
//        else
//            System.out.print("NO");

//        System.out.printf("\nЗадание 3\n");
////        Перевод в верхний регистр. Программа получает на вход один символ. Если этот символ является строчной буквой латинского алфавита (то есть буквой от a до z), выведите вместо него аналогичную заглавную букву, иначе выведите тот же самый символ. Для этого сделайте функцию char toUpper(char c), которая переводит данный символ в верхний регистр.
//        System.out.print(toUpper(in.next().charAt(0)));
//
//        System.out.printf("\nЗадание 4\n");
////        Измените регистр символа: если он был латинской буквой: сделайте его заглавным, если он был строчной буквой и наоборот. Для этого напишите отдельную функцию, меняющую регистр символа.
//        System.out.print(SwitchCase(in.next().charAt(0)));

//        System.out.printf("\nЗадание 5\n");
////        Даны две строки. Определите, совпадают ли они, сравнив их посимвольно. Напишите для этого функцию boolean compare(String S1, String S2).
////        Вход: две строки.   Выход: слово yes, если строки совпадают, слово no в противном случае.
        String S1,S2;
//        S1 = in.nextLine();
//        S2 = in.nextLine();
//        if (compare(S1, S2))
//            System.out.print("YES");
//        else
//            System.out.print("NO");

//        System.out.printf("\nЗадание 6\n");
////        Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность непробельных символов, слова разделены одним пробелом, первый и последний символ строки – не пробел).
////        Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность непробельных символов, слова разделены одним пробелом, первый и последний символ строки – не пробел).
////        Вход: На вход подается несколько строк. Входная строка должна считываться методом getline (В случае использования Scanner).
////        Выход: количество слов в первой из введенных строк.
//        S1=in.nextLine();
//        String[] StringArray = S1.split(" ");
//        System.out.print(StringArray.length);

//        System.out.printf("\nЗадание 7\n");
////        Дана строка, содержащая пробелы. Найдите в ней самое длинное слово, выведите на экран это слово и его длину.
////        Вход: одна строка, содержащая пробелы. Слова разделены ровно одним пробелом. Строка должна считываться методом getline (программа должна считывать только одну первую строку).   Выход: самое длинное слово в строке и его длина.
//        int length = 0;
//        String nextWord, maxWord = "";
//        StringTokenizer st = new StringTokenizer(in.nextLine());
//        while (st.hasMoreTokens())
//        {
//            nextWord = st.nextToken();
//            if (nextWord.length() > length) {
//                length = nextWord.length();
//                maxWord=nextWord;
//            }
//        }
//        System.out.println(maxWord + length);

        System.out.printf("\nЗадание 8\n");
//        По данной строке, определите, является ли она палиндромом (то есть можно ли прочесть ее наоборот, как, например,
// слово `топот').
//        Вход: одна строка без пробелов.  	 Выход: yes, если слово является палиндромом, no в противном случае.
        S1="топот";
        boolean b=false;
        for (int i=0; i < (S1.length()/2); i++)
        {
            if (S1.charAt(i)==S1.charAt(S1.length()-i-1))
                b=true;
            else
                b=false;
        }
        if (b)
            System.out.print("Палиндром");
        else
            System.out.print("Не палиндром");

        System.out.printf("\nЗадание 9\n");
//        Дана строка. Известно, что она содержит ровно две одинаковые буквы. Найдите эти буквы.  Вход: одна строка.
        String s = "помогите";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i=1; i < chars.length; i++)
            if (chars[i-1]==chars[i])
                System.out.print(chars[i]);

        System.out.printf("\nЗадание 10\n");
//        Даны две строки. Определите, является ли первая строка подстрокой второй строки.   Вход: две строки.   Выход: слово yes, если первая строка является подстрокой второй строки, или слово no в противном случае.

        String source = "aabaaaaa", template = "abaa";

        int sourceLen = source.length();
        int templateLen = template.length();
        if (templateLen > sourceLen) {
            System.out.print("No");
        }

        HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
        for (int i = 0; i < 256; i++) {
            HM.put((char) i, templateLen);
        }
        for (int i = 0; i < templateLen - 1; i++) {
            HM.put(template.charAt(i), templateLen - i - 1);
        }
        int h = templateLen - 1;
        int j = h;
        int k = h;
        while (j >= 0 && h < sourceLen) {
            j = templateLen - 1;
            k = h;
            while (j >= 0 && source.charAt(k) == template.charAt(j)) {
                k--;
                j--;
            }
            h += HM.get(source.charAt(h));
        }
        if (k >= sourceLen - templateLen) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }

        System.out.printf("\nЗадание 11\n");
//        Капитан Флинт зарыл клад на Острове сокровищ. Он оставил описание, как найти клад. Описание состоит из строк вида: "North 5", где первое слово – одно из "North", "South", "East", "West", а второе число – количество шагов, необходимое пройти в этом направлении.
//        Напишите программу, которая по описанию пути к кладу определяет точные координаты клада, считая, что начало координат находится в начале пути, ось OX направлена на восток, ось OY – на север.
//        Вход: последовательность строк указанного формата.  Выход: координаты клада – два целых числа через пробел.
//                Например, при вводе
//        North 5
//        East 3
//        South 1
//        программа должна вывести координаты 3 4.
        List<String> StringList = new ArrayList<String>();
        int NS=0, WE=0;
        String der;
        try{
            Scanner sc = new Scanner(new File("Silver.txt"));
            while(sc.hasNextLine())
                StringList.add(sc.nextLine());
            sc.close();
        } catch(FileNotFoundException e){e.printStackTrace();}
        for (String str : StringList) {
            StringTokenizer strt = new StringTokenizer(str);
            der = strt.nextToken();
            if (der.equals("North"))
                NS += Integer.parseInt(strt.nextToken());
            else if (der.equals("South"))
                NS -= Integer.parseInt(strt.nextToken());
            else if (der.equals("East"))
                WE += Integer.parseInt(strt.nextToken());
            else WE -= Integer.parseInt(strt.nextToken());
        }
        System.out.print(NS + " " + WE);

        System.out.printf("\nЗадание 12\n");
        StringBuilder SB = new StringBuilder();
//        Дана строка, содержащая пробелы. Проверьте, является ли она палиндромом без учета пробелов (например, ‘аргентина манит негра’).
//        Вход: одна строка, содержащая пробелы. Подряд может идти произвольное число пробелов.
//        Выход: yes, если данная строка является палиндромом и no в противном случае.
        S1="аргентина    манит   негра ";
        SB.insert(0,S1.replaceAll("\\s", ""));
        b=false;
        for (int i=0; i < (SB.length()/2); i++)
        {
            if (SB.charAt(i)==SB.charAt(SB.length()-i-1))
                b=true;
            else
                b=false;
        }
        if (b)
            System.out.print("Палиндром");
        else
            System.out.print("Не палиндром");
    }

    static boolean IsDigit(char c) {
        return (c > 47 && c<58);
    }

    static char toUpper(char c) {
        if (c > 97 && c < 123)
            c-=32;
        return c;
    }

    static char SwitchCase(char c) {
        if (c > 97 && c < 123)
            c-=32;
        if (c > 64 && c < 91)
            c+=32;
        return c;
    }

    static boolean compare(String S1, String S2) {
        return (S1.hashCode()==S2.hashCode());
    }
}
