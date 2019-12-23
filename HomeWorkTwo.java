package ru.geekbrains.java_one.lesson_b.online;

public class HomeWorkTwo {

    private static void arrPrinter(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void matrPrinter(int[][] matr) {
        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr.length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] changeOneZero(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    private static int[] createArrPlusThree(int[] arr) {
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        }
        return arr;
    }

    private static int[] multiplicationTwo(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    private static int minArr (int[] arr) {
        int minArr = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        return minArr;
    }

    private static int maxArr (int[] arr) {
        int maxArr = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        return maxArr;
    }

    private static int[][] matrDiagonal(int[][] matr) {
        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr.length; j++) {
                if(i == j || (i + j + 1) == matr.length){
                    matr[i][j] = 1;
                }
            }
        }
        return matr;
    }

    private static boolean checkBalance(int[] arr) {
        int i = 0;
        boolean balance = false;
        while (i < arr.length) {
            int left = 0;
            int right = 0;
            for(int j = 0; j <= i; j++) {
                left = left + arr[j];
            }
            for(int j = i+1; j < arr.length; j++) {
                right = right + arr[j];
            }
            if(left == right) {
                balance = true;
                break;
            } else {
                i++;
            }
        }
        return balance;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arrPrinter(arr);
        arr = changeOneZero(arr);
        arrPrinter(arr);

        int[] arr1 = new int[8];
        arr1 = createArrPlusThree(arr1);
        arrPrinter(arr1);

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrPrinter(arr2);
        arr2 = multiplicationTwo(arr2);
        arrPrinter(arr2);

        int[] arr3 = {3, 15, 6, -7, 8, 23, 0};
        arrPrinter(arr3);
        int minArr3 = minArr(arr3);
        int maxArr3 = maxArr(arr3);
        System.out.println("min = " + minArr3);
        System.out.println("max = " + maxArr3);

        int matr[][] = new int[7][7];
        matr = matrDiagonal(matr);
        matrPrinter(matr);

        int arr4[] = {2, 1, 1, 2, 1};
        System.out.println(checkBalance(arr4));
    }
}
