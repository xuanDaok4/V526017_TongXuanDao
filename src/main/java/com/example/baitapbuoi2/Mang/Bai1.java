package com.example.baitapbuoi2.Mang;
import java.util.Scanner;
public class Bai1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử n: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            int sum = 0;

            System.out.println("Nhập " + n + " phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + i + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }


            System.out.print("Mảng vừa nhập: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nTổng các phần tử trong mảng: " + sum);
        }
    }

