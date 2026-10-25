package com.example.baitapbuoi2.chuoi;

public class Bai2 {
        public static void inMangTong(int[] arr1, int[] arr2) {
            int maxLength = Math.max(arr1.length, arr2.length);
            int[] sumArr = new int[maxLength];

            for (int i = 0; i < maxLength; i++) {
                int val1 = (i < arr1.length) ? arr1[i] : 0;
                int val2 = (i < arr2.length) ? arr2[i] : 0;
                sumArr[i] = val1 + val2;
            }
            System.out.print("Mảng tổng: ");
            for (int num : sumArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5};
            int[] b = {10, 20, 30};
            inMangTong(a, b);
        }
    }

