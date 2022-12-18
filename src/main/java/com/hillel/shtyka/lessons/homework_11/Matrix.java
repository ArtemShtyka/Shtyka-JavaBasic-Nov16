package com.hillel.shtyka.lessons.homework_11;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int m, n;
        Scanner mtxdim = new Scanner(System.in);
        System.out.println("Задайте розмірність матриці A[m; n]");
        while (true) {
            System.out.println("Введіть число m рядків матриці: ");
            if(mtxdim.hasNextInt()) {
                m = mtxdim.nextInt();
                if(m > 0) break;
                else System.out.println("Число рядків матриці не може дорівнювати нулю.");
            }
            else System.out.println("Введіть дійсне число.");
            mtxdim.nextLine();
        }
        while (true) {
            System.out.println("Введіть число n стовпців матриці: ");
            if(mtxdim.hasNextInt()) {
                n = mtxdim.nextInt();
                if(n > 0) break;
                else System.out.println("Число стовпців матриці не може дорівнювати нулю.");
            }
            else System.out.println("Введіть дійсне число.");
            mtxdim.nextLine();
        }
        int[][] matrix = new int[m][n];
        System.out.println("Вихідна матриця: ");
        for(int i = 0; i < matrix.length; i += 1) {
            for(int j = 0; j < matrix[i].length; j += 1) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Транспонована матриця: ");
        int[][] matrixT = transpose(matrix);
        for (int i = 0; i < matrixT.length; i += 1) {
            for (int j = 0; j < matrixT[i].length; j += 1) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
    public static int[][] transpose(int[][] inputMatrix) {
        int i, j, t;
        int[][] transposed = new int[inputMatrix[0].length][inputMatrix.length];
        for(i = 0; i < inputMatrix.length; i+=1) {
            for(j = 0; j < inputMatrix[0].length; j+=1) {
                t = inputMatrix[i][j];
                transposed[j][i] = t;
            }
        }
        return transposed;
    }
}
