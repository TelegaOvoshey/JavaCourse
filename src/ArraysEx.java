/**
 * Created by RedEYE on 23.12.2016.
 */
import java.util.Arrays;

import static java.lang.Math.*;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr1;

        System.out.printf("\nЗадание 1\n");
        int n=10;
        arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = (int)(random() * n);
        showarr(arr1);
        System.out.print("\nЧетные индексы\n");
        for (int i=0; i < n; i+=2) {
            System.out.print("arr1["+ i + "]:" + arr1[i]+ " ");
        }

        System.out.printf("\n\nЗадание 2\n");

        System.out.print("\nЧетные элементы\n");
        for (int i=0; i < n; i+=2) {
            if (arr1[i]%2==0)
            System.out.print("arr["+ i + "]:" + arr1[i]+ " ");
        }

        System.out.printf("\n\nЗадание 3\n");
        int[] arr2;
        arr2 = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr2[i] = ((int)(random() * 31)-15);
            if (arr2[i]>=0)
                sum++;
        }
        showarr(arr2);
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 4\n");
        showarr(arr1);
        System.out.print("\n");
        for (int i = 1; i < n; i++) {
            if (arr1[i]>arr1[i-1])
                System.out.print("arr["+ i + "]:" + arr1[i]+ " ");
        }

        System.out.printf("\n\nЗадание 5\n");
        boolean b = false;
        for (int i = 0; i < n; i++) {
            do {
                arr2[i] = ((int) (random() * 21) - 10);
            } while (arr2[i] == 0);
            }
        for (int i = 0; i < n-1; i++) {
            if ((arr2[i] > 0 && arr2[i + 1] > 0) || (arr2[i] < 0 && arr2[i + 1] < 0)) {
                b = true;
            }
        }
        showarr(arr2);
        if (b==true)
            System.out.print("\nYES");
        else
            System.out.print("\nNO");

        System.out.printf("\n\nЗадание 6\n");
        showarr(arr2);
        sum = 0;
        for (int i = 1; i < n-1; i++) {
            if ((arr2[i] > arr2[i + 1]) && (arr2[i] > arr2[i - 1])) {
                sum++;
            }
        }
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 7\n");
        showarr(arr2);
        int swap;
        for (int i=1; i < (n/2); i++) {
            swap = arr2[n-i];
            arr2[n-i]=arr2[i-1];
            arr2[i-1]=swap;
        }
        showarr(arr2);

        System.out.printf("\n\nЗадание 8\n");
        showarr(arr2);
        for(int i=0; i<n-1; i+=2)
        {
            swap=arr2[i];
            arr2[i]=arr2[i+1];
            arr2[i+1]=swap;
        };
        System.out.print("\n");
        showarr(arr2);

        System.out.printf("\n\nЗадание 9\n");
        showarr(arr1);
            swap = arr1[n-1];
            for (int j = (n-1); j > 0; j--) {
                arr1[j] = arr1[j-1];
            }
            arr1[0] = swap;
        System.out.print("\n");
        showarr(arr1);

        System.out.printf("\n\nЗадание 10\n");
        showarr(arr1);
        int max=arr1[0];
        for (int j = 1; j < n; j++) {
            if(arr1[j] > arr1[j-1])
                max = arr1[j];
        }
        System.out.print("\n" + max);

        System.out.printf("\n\nЗадание 11\n");
        Arrays.sort(arr1);
        showarr(arr1);
        sum=0;
        for (int i = 0; i < n; i++)
            if (swap != arr1[i]) {
                swap=arr1[i];
                sum++;
        }
        System.out.print("\n" + sum);

        System.out.printf("\n\nЗадание 12\n");


    }

    static void showarr (int[] arr) {
        int n = arr.length;
        System.out.print("Весь массив\n");
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+ i + "]:" + arr[i]+ " ");
        }
    }


}
