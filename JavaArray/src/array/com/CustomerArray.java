package array.com;

import java.util.Arrays;
import java.util.Random;

public class CustomerArray {

    public int[] createArray(int size) {
        if (size < 0) throw new NegativeArraySizeException();

        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 20);
        }
        return arr;
    }

    public void showArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public long sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public int midleArifmeticArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public int maxArray(int[] arr) {
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i])
                maxNum = arr[i];
        }
        return maxNum;
    }

    public int minArray(int[] arr) {
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minNum > arr[i])
                minNum = arr[i];
        }
        return minNum;
    }

    public void oddArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
}
