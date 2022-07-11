package array.com;

public class Main {
    public static void main(String[] args) {
        CustomerArray arr = new CustomerArray();
        int[] c = arr.createArray(7);
//        System.out.println(arr.sumArray(c));
//        System.out.println(arr.midleArifmeticArray(c));
//        System.out.println(arr.maxArray(c));
//        System.out.println(arr.minArray(c));
//        arr.oddArray(c);
        arr.showArray(c);
//-----------------------------------
        ReversedArray reversedArray = new ReversedArray();
        int[] a = reversedArray.myReverse(c);
        arr.showArray(a);
        a = reversedArray.subArray(a, 3, 7);
        arr.showArray(a);
//-----------------------------------
        UserArray userArray = new UserArray();
        userArray.plusSize(c);
        userArray.addArray(c, 5);
    }
}