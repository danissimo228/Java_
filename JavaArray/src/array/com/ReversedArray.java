package array.com;

public class ReversedArray {

    public int[] myReverse(int[] array) {
        int[] reverseArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArr[i] = array[array.length-1 - i];
        }
        return reverseArr;
    }

    public int[] subArray(int[] array, int index, int count) {

        int[] arr2 = new int[count];
        int c = 0;

        if((array.length - index) < count) {
            for (int i = index; i < array.length; i++) {
                arr2[c] = array[i];
                c++;
            }
            for (int i = index+1; i < count; i++) {
                arr2[i] = 1;
            }
        }
        else{
            for (int i = index; i < array.length; i++) {
                arr2[c] = array[i];
                c++;
            }
        }
        return arr2;
    }
}
