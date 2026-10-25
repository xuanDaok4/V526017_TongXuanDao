package com.example.baitapbuoi2.Mang;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Số phần tử không hợp lệ!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
