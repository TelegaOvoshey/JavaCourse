import java.util.*;

public class PP_T6 {
    public static void main(String[] args) {

        System.out.printf("\nЗадание 1\n");
        int min;
        long t1, t2;
        int[] num = new int[4];
        Scanner in = new Scanner(System.in);
        System.out.printf("\nВведите данные\n");
        for (int i=0; i<num.length; i++)
            num[i]=in.nextInt();

        t1=System.nanoTime();
        min=min(num[0],num[1],num[2],num[3]);
        System.out.print("\n"+min);
        t2=System.nanoTime();
        System.out.print("\nВремя 1:"+(t2-t1));

        t1=System.nanoTime();
        int a, n;

        min=min1(num);
        System.out.print("\n"+min+"\n");
        t2=System.nanoTime();
        System.out.print("Время 2:"+(t2-t1));

        System.out.printf("\nЗадание 2\n");
        System.out.printf("Введите число и его степень\n");
        a=in.nextInt();
        n=in.nextInt();
        System.out.print(pow(a,n));

        System.out.printf("\nЗадание 3\n");
        boolean b1 = true, b2 = true;
        System.out.print(XOR(b1, b2));

        System.out.printf("\nЗадание 4\n");
        System.out.printf("\nВведите данные\n");
        boolean b3;
        b1 = (in.nextInt() != 0);
        b2 = (in.nextInt() != 0);
        b3 = (in.nextInt() != 0);
        System.out.print(Election(b1, b2, b3));

        System.out.printf("\nЗадание 5\n");
        if (IsPrime(102))
            System.out.print("prime");
        else
            System.out.print("composite");

        System.out.printf("\nЗадание 6\n");
        System.out.print(SumOfDigits (123456789));

        System.out.printf("\nЗадание 7\n");
        System.out.print(Reverse(123456789));

        System.out.printf("\nЗадание 8\n");
        n = 100;
        int coin=0;
        for (int i=1; i<n; i++) {
            if (IsPalindrome(i))
                coin++;
        }
        System.out.print(coin);

        System.out.printf("\nЗадание 9\n");
        System.out.print(pow(2, 5));

        System.out.printf("\nЗадание 10\n");
        System.out.print(pow(2, -5));

        System.out.printf("\nЗадание 11\n");
        System.out.print(pow(2, 5));

        System.out.printf("\nЗадание 12\n");
        System.out.print(Phib(5));

        System.out.printf("\nЗадание 13\n");
        System.out.print(Binomial(5,2));

        System.out.printf("\nЗадание 14\n");
        Move(4, 1, 2, 3);

        System.out.printf("\nЗадание 15\n");
        int[] array = {2,4,2,1,3,4};
        Arrays.sort(array);
        showarr(array);
        System.out.println();
        System.out.print(Search(array, 1));
        System.out.println();
        System.out.print(Search(array, 0));

        System.out.printf("\nЗадание 16\n");
        System.out.print(CountMax(array));

        System.out.printf("\nЗадание 17\n");
        LastMax(array);

        System.out.printf("\nЗадание 18\n");
        int [] A = {1,5,7}, B = {2,4,4,5}, C;
        C = Merge(A,B);
        showarr(A);
        showarr(B);
        showarr(C);

        System.out.printf("\nЗадание 19 и 20\n");//переписать в функцию
        List<Integer> list = Arrays.asList(2,2,2,3,2,3,2,2,3,3,3,5,5,1);
        Counting(list);

        System.out.printf("\nЗадание 21\n");
        Intersection(A,B);
        }

    static void Counting (List<Integer> list) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        Integer am;
        for (Integer i : list) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }

        for (Object key : hm.keySet().toArray()) {

            if (hm.get(key) == 1) {

                hm.remove(key);
            }
        }
        System.out.println(hm);
    }

    //с этими двумя не знаю, как иначе
    static int CountMax (int A[]) {
        int max = A[0], coin=0;
        for (int i =0; i < A.length; i++) {
            if (max<A[i]) {
                coin=1;
                max=A[i];
            }
            else if(max==A[i])
                coin++;
        }
        return coin;
    }

    static void LastMax (int A[]) {
        int max = A[0], index = 0;
        for (int i =0; i < A.length; i++) {
            if (max<A[i]) {
                max=A[i];
            }
            else if(max==A[i])
                index=i;
        }
        System.out.print(max + " " + index);
    }

    static int Search (int [] A, int  x) {
            int i = -1;
            if (A != null) {
                int low = 0, high = A.length, mid;
                while (low < high) {
                    mid = (low + high)/2;
                    if (x == A[mid]) {
                        i = mid;
                        break;
                    } else {
                        if (x < A[mid]) {
                            high = mid;
                        } else {
                            low = mid + 1;
                        }
                    }
                }
            }
            return i;
        }

    static void Intersection(int [] A, int [] B) {
        List<Integer> C = new ArrayList<Integer>();
        for (int i1 : A)
        {
            for (int i2 : B)
            {
                if (i1 == i2)
                {
                    if (!C.contains(i1))
                        C.add(i1);
                    break;
                }
            }
        }
        for (int i : C)
        System.out.print(i);
    }

    static void showarr(int[] arr) {
        int n = arr.length;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]:" + arr[i] + " ");
        }
    }
    static void Move(int amount, int from, int to, int buf)	{
        if (amount != 0)
        {
            Move(amount-1, from, buf, to);
            System.out.println("Disk " + amount + " move from " + from + " to " + to );
            Move(amount-1, buf, to, from);
        }
    }

    static int min1(int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    static int min(int a, int b, int c, int d)
    {
        if ((a<b)&(a<c)&(a<d))
            return a;
        else if ((b<c)&(b<d))
            return b;
        if (c<d) return c;
        else
            return d;
    }

    static double pow(double a, double n) {
        if (n == 0) return 1;
        if (n<0) return 1.0/pow(a, -n);
        if (n % 2 == 0) return pow(a * a, n / 2);
        return a * pow(a, n - 1);
    }

    static boolean XOR(boolean b1, boolean b2) {
        return (b1&&!b2)||(!b2&&b1);
    }

    static boolean Election(boolean b1, boolean b2, boolean b3) {
        return (b1&&b2||b1&&b3||b2&&b3);
    }

    static double Pow(int value, int pow)
    {
        if (pow==0)
            return 1;
        if (pow>0)
            return Pow(value, pow-1) * value;
        return 1.0/Pow(value, -pow);
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
    static int SumOfDigits (int n) {
        int coin=0;
        while (n>0){
            coin+=n%10;
            n/=10;
        }
        return coin;
    }

    static int Reverse(int n){
        int d=0;
        while (n>0) {
            d=d*10+n%10;
            n/=10;
        }
        return d;
    }

    static boolean IsPalindrome (int n) {
        return (Reverse(n)==n);
    }

    static int Phib(int n) {
    int f1 = 1, f2 = 1, fibsum = 0;
        for (int i = 2; i<n-1; i++)
    {
        fibsum = f1+f2;
        f1=f2;
        f2=fibsum;
    }
        return fibsum;
    }

    static int Binomial(int n, int r) {
        if (r==0||n==r)
            return 1;
        else
            return Binomial(n-1,r-1)+Binomial(n-1,r);
    }

    static int [] Merge (int[] A, int[] B) {
            int a = 0, b = 0, len = A.length + B.length; // a, b - счетчики в массивах
            int [] C = new int[len];
            for (int i = 0; i < len; i++) {
                if (b < B.length && a < A.length) {
                    if (A[a] > B[b]) C[i] = B[b++];
                    else C[i] = A[a++];
                } else if (b < B.length) {
                    C[i] = B[b++];
                } else {
                    C[i] = A[a++];
                }
            }
        return C;
        }
   }
