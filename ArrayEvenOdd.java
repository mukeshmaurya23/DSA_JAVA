public class ArrayEvenOdd {
    void findOddEven(int arr[]) {
        int arr1[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] % 2 != 0) {
                arr1[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[index++] = arr[i];
            }
        }
        for (int x : arr1) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };

        ArrayEvenOdd od = new ArrayEvenOdd();
        od.findOddEven(arr);

    }
}