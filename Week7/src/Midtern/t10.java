import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class t10 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入矩陣N和M為:");
        String[] inputNM_array = bfReader.readLine().split(" ");
        int N = Integer.parseInt(inputNM_array[0]);
        int M = Integer.parseInt(inputNM_array[1]);
        if (N == 0 || M == 0) return;
        String[][] matrix = new String[N][M];
        for (int i = 0; i < N; i++) {
            System.out.print("輸入矩陣數值第" + (i+1) +"列為:");
            String[] input_line = bfReader.readLine().split(" ");
            matrix[i] = input_line;
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix[0][0]);

        for (int i = 0; i < M; i++) {
            System.out.print("輸出矩陣數值第" + (i+1) +"列為:");
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println("");
        }
        

    }
}