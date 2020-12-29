package com.company;

import java.util.Scanner;

public class Main {
    public static void bubbleSort(int[] a){
        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( a[j] > a[j+1] ){
                int t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер первого массива:");
        int n = in.nextInt();
        System.out.println("Введите размер второго массива:");
        int m = in.nextInt();
        int[] a = new int[n+m];
        int[] b = new int[n+m];
        System.out.println("Введите элементы первого массива:");
        for(int i = 0; i< n;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Введите элементы второго массива:");
        for(int i = 0; i< m;i++){
            b[i] = in.nextInt();
        }
        int j = 0;
        for(int i = n;i < n+m;i++){
            a[i] = b[j];
            j++;
        }
        bubbleSort(a);
        for(int i = 0;i < n+m;i++){
            System.out.println("a["+ i + "] = " + a[i]);
        }
    }

}