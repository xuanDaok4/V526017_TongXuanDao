package com.example.baitapbuoi2.Mang;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập số nguyên cần tìm chỉ số: ");
        int target = scanner.nextInt();

        boolean found = false;
        System.out.print("Chỉ số của phần tử " + target + " trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        } else {
            System.out.println();
        }
    }
}
