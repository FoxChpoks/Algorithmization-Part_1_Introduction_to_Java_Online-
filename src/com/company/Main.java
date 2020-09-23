package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /** Одномерные массивы **/
        // Task_1
        // В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратные данному K.

//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        System.out.print("Число K = ");
//        int k = scan.nextInt();
//        scan.nextLine();
//        // заполнение массива
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i + 1;
//        }
//        // вывод массива
//        printArray(myArray);
//        // нахождение суммы кратных чисел
//        int sum = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] % k == 0) {
//                sum += myArray[i];
//            }
//        }
//        System.out.printf("Сумма кратных чисел = %d", sum);

        // Task_2
        // Дана последовательность действительных чисел а1, а2,...,an. Заменить все ее члены, большие данного Z, этим числом.
        // Подсчитать количество замен.

//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        System.out.print("Число Z = ");
//        int z = scan.nextInt();
//        scan.nextLine();
//        // заполнение массива
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i + 1;
//        }
//        // вывод массива
//        printArray(myArray);
//        int counter = 0; // счетчик замен
//        for (int i = 0; i < myArray.length;i++) {
//            if (myArray[i] > z) { // если текущий элемент
//                myArray[i] = z;
//                counter++;
//            }
//        }
//        printArray(myArray);
//        System.out.println("Количество замен = " + counter);

        // Task_3
        // Дан массив действительных чисел, размерность которого N.
        // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        randomArray(myArray);
//        printArray(myArray);
//        int counterPositive = 0;
//        int counterZero = 0;
//        int counterNegative = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > 0) {
//                counterPositive++;
//            } else if (myArray[i] < 0) {
//                counterNegative++;
//            } else {
//                counterZero++;
//            }
//        }
//        System.out.printf("Положительных чисел %d \nОтрицательных чисел %d \nНейтральных чисел %d \n", counterPositive, counterNegative, counterZero);

        // Task_4
        // Даны действительные числа a1,a2,...,an. Поменять местами наибольший и наименьший элементы.

//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        randomArray(myArray);
//        printArray(myArray);
//        int maxNum = myArray[0];
//        int minNum = myArray[0];
//        for (int i = 0; i < myArray.length; i++) {
//            if (maxNum < myArray[i]) {
//                maxNum = myArray[i];
//            }
//            if (minNum > myArray[i]) {
//                minNum = myArray[i];
//            }
//        }
//        System.out.printf("Наибольший элемент %d \nНаименьший элемент %d", maxNum, minNum);

        // Task_5
        // Даны целые числа a1,a2,...an.
        // Вывести на печать только те цифры, для которых ai > i.
//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        randomPositiveArray(myArray, size);
//        printArray(myArray);
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > i) {
//                System.out.print(myArray[i] + "\t");
//            } else {
//                System.out.print("\t");
//            }
//        }

        // Task_6
        // Задана последовательность N вещественных чисел.
        // Вычислить сумму тех чисел, порядковые номера которых являются простыми числами.
//        System.out.print("Размер массива = ");
//        int size = scan.nextInt();
//        int[] myArray = new int[size];
//        // заполнение массива
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i + 1;
//        }
//        // вывод массива
//        printArray(myArray);
//        int sum = 0;
//        for (int i = 2; i < myArray.length; i++) { // минимальное простое число - 2
//            if (checkPrimeNumber(i)) {
//                sum += myArray[i];
//            }
//        }
//        System.out.println("Сумма = " + sum);


        // Task_7
        // !!!!

        // Task_8
        // !!!!!

        // Task_9
        // В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них.

        System.out.print("Размер массива = ");
        int size = scan.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * size / 2) + 1;
        }
        printArray(myArray); // вывод массива
        int[] counterArray = new int[myArray.length]; // массив под счетчик повторений
        int counterСurrent = 0; // текущий счетчик нахождения числа
        int counterMax = 0; // максимальное значение счетчика - максимальное количество повторений числа
        int pointerCounterArray = 0; // указатель для записи текущих счетчиков в массив
        int numberMax = myArray[0]; // максимальное значение
        for (int i = 0; i < myArray.length; i++) { // каждый элемент сравнивается со всеми элементами
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) { // если элемент повторяется - счетчик увеличивается
                    counterСurrent++;
                }
            }
            if (counterСurrent > counterMax) { // если текущий счетчик больше максимального - изменить максимальный счетчик
                counterMax = counterСurrent;
                numberMax = myArray[i]; // число с наибольшим числом повторений
            }
            counterArray[pointerCounterArray++] = counterСurrent;
            counterСurrent = 0; // обнуление счетчика для следующего цикла
        }
        // нахождение минимального элемента среди самых повторяющихся
        int minItem = numberMax;
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] == counterMax && myArray[i] < minItem) {
                minItem = myArray[i];
            }
        }
        System.out.printf("Наибольшее количество повторений - (%d) у самого маленького числа '%d'\n", counterMax, minItem);

    }

    /**
     * Метод для определения, простое ли число
     **/
    static boolean checkPrimeNumber(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Метод рандомайзинг массива только положительными элементами
     **/
    static void randomPositiveArray(int[] array, int size) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size) + 1;
        }
    }

    /**
     * Метод рандомайзинг массива положительными и отрицательными элементами
     **/
    static void randomArray(int[] array) { // рандомит числа в промежутке [-10;10]
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) - 10;
        }
    }

    /**
     * Методы для вывода массива
     **/
    static void printArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println();
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
