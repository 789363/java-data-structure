import java.util.Arrays;

public class merge {
    public static int[] mergesort(int[] Array1, int[] Array2) {
        int[] number3 = new int[Array1.length + Array2.length];

        int i = 0, j = 0, k = 0;
        while (i < Array1.length && j < Array2.length) {
            if (Array1[i] <= Array2[j])
                number3[k++] = Array1[i++];
            else
                number3[k++] = Array2[j++];
        }

        while (i < Array1.length)
            number3[k++] = Array1[i++];
        while (j < Array2.length)
            number3[k++] = Array2[j++];

        return number3;
    }

    public static void main(String[] args) {
        int[] Array1 = { 1, 3, 5, 7, 9 };
        int[] Array2 = { 2, 4, 6, 8, 10 };
        int[] result = mergesort(Array1, Array2);
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        System.out.println("mergesort-result: " + Arrays.toString(result));
    }
}
