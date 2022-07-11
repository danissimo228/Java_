package array.com;

public class UserArray {

    public int[] plusSize(int[] arr) {
        int[] arr2 = new int[arr.length + 1];
        return arr2;
    }

    public int[] addArray(int[] arr, int value) {
        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = value;

        return arr2;
    }
}
