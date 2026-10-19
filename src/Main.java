import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //cüt ededler
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ededi daxil edin");
//        int odd = scanner.nextInt();
//        if (odd%2==0){
//            System.out.println("eded cutdur");
//        }else {
//            System.out.println("eded tekdir");
//        }

        // 1den ne qeder ededlerin cemi
//        int sum=0;
//        int n=4;
//        for (int i = 0; i <= n; i++) {
//            sum=sum+i;
//        }
//        System.out.println(sum);


        //Massivin en boyuk ve en kicik elementi
//        int[] arr={2,3,45,7,5,10};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i]<arr[j]){
//                    int temp=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//
//            }


//
//            System.out.println(Arrays.toString(arr));
//        //en boyuk
//        System.out.println(arr[1]);
//        //en kicik
//        System.out.println(arr[arr.length-1]);

        //sade ededler
//        int input=9;
//        if (input%2==0 || input%3==0){
//            System.out.println("eded sade deyil");
//        }else {
//            System.out.println("eded sadedir");
//        }

        //birden elliye qeder edeler
//        int n = 50;
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0)
//                System.out.println(i + "Fizz");
//            if (i % 5 == 0) {
//                System.out.println(i + "buzz");
//            }
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println(i + "fizzbuzz");
//            }
//
//
//        }
//        //Massivi artan sira ile duz
//        int[] arr={2,3,45,7,5,10};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i]<arr[j]){
//                    int temp=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));

        //edelerin cemi ve ededi ortasi
        int[] arr={2,3,45,7,5,10};
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum+=arr[i];
        }
        int orta =sum/count;
        System.out.println(sum);
        System.out.println(orta);


    }
}