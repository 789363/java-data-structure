import java.util.Arrays;

public class selcet {
    // 選擇排序
    public static void selcetionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 9, 6, 3, 7, 8, 5, 4 };
        selcetionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}