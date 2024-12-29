package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayProgram {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }


        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        insertionSort(array);

        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Число " + target + " знайдено на індексі " + index + ".");
        } else {
            System.out.println("Число " + target + " не знайдено у масиві.");
        }
    }
}

