/**
 * Created by RedEYE on 23.12.2016.
 */
public class Arithmetic {
        public static void main(String[] args) {
            System.out.printf("Задание 1");
            int a = 13 / 5; //деление целого типа
            int b = 13 % 5; //вычисление остатка от деления целого типа
            int c = (int)13.0 / 5; //приведенный к целому типу результат деления числа с плавающей точкой
            double d = 13 / 5; //приведенный к типу с плавающей точкой результат деления целого типа
            double e = 13 % 5; //приведенный к типу с плавающей точкой остаток от деления целого типа
            double f = 13.0 / 5; //результат деления типа с плавающей точкой
            double g = 13 / 5 + 2 / 5; //сумма результатов делений целочисленных типов
            double h = 13.0 / 5 + 2.0 / 5; //сумма результатов делений типов с плавающей точкой
            int i = (int)(13.0 / 5 + 2.0 / 5); //приведенная к целочисленному типу сумма результатов делений типов с плавающей точкой
            System.out.printf("\na = "+a+"\n"+"b = "+b+"\n"+"d = "+d+"\n"+"e = "+e+"\n"+"f = "+f+"\n"+"g = "+g+"\n"+"h = "+h+"\n"+"i = "+i);

            System.out.printf("\nЗадание 2\n");
            int x=2;
            x*=x;
            x*=x;
            System.out.print(x);

            System.out.printf("\nЗадание 3\n");
            x=2;
            x=x*x*x;
            x*=x;
            System.out.print(x);

            System.out.printf("\nЗадание 4\n");
            x=2;
            int y=x*x;
            x=y*x;
            x=y*y*x;
            System.out.print(x);

            System.out.printf("\nЗадание 5\n");
            x=2;
            y=x*x;
            x=y*y*y*x;
            x=x*x*x;
            System.out.print(x);

            System.out.printf("\nЗадание 6\n");
            x=4250;
            x%=10;
            System.out.print(x);

            System.out.printf("\nЗадание 7\n");
            x=78;
            x/=10;
            System.out.print(x);

            System.out.printf("\nЗадание 8\n");
            x=71198;
            x%=100;
            x/=10;
            System.out.print(x);

            System.out.printf("\nЗадание 9\n");
            x=178;
            y=0;
            do {
                y=y+x%10;
                x/=10;
            }while (x>0);
            System.out.print(y);

            System.out.printf("\nЗадание 10\n");
            int mkad=109, l, t=60, v=2;
            l=v*t;
            l%=mkad;
            System.out.print(l);

            System.out.printf("\nЗадание 11\n");
            int n=125;
            System.out.print(n/60%24+" ч "+n%60+" м");

            System.out.printf("\nЗадание 12\n");
            int H=0, M=0, S=0, angle;
            angle=(360*(H%12*3600+M*60+S))/43200;
            if (H%12>6) {
                angle=360-angle;
            }
            System.out.print("Угол "+angle+" гр");
        }
}
