import java.util.Arrays;

public class insert {
    // 插入排序
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 9, 6, 3, 7, 8, 5, 4 };
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}