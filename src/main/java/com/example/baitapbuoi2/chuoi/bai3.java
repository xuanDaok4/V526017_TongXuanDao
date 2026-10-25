package com.example.baitapbuoi2.chuoi;
import java.util.Scanner;
public class bai3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chuỗi các số nguyên (cách nhau bởi dấu cách): ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Số phần tử: 0; Tổng: 0");
                return;
            }
            String[] parts = input.split("\\s+");
            int count = parts.length;
            int sum = 0;

            for (String part : parts) {
                sum += Integer.parseInt(part);
            }
            System.out.println("Số phần tử: " + count + "; Tổng: " + sum);
        }

}
