import java.io.BufferedReader;
import java.io.InputStreamReader;


public class t8 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int input_length = Integer.parseInt(bfReader.readLine());
        String[] input_array = bfReader.readLine().split(" ");

        int max_repeat_number = 0;
        int max_repeat_times = 0;
        String[] descending_array = input_array;
        // 排序一個Array大到小
        for (int i = 0; i < input_length - 1; i++) {
            for (int j = 0; j < input_length - 1 - i; j++) {
                if (Integer.parseInt(descending_array[j]) < Integer.parseInt(descending_array[j + 1])) {
                    String temp = descending_array[j];
                    descending_array[j] = descending_array[j + 1];
                    descending_array[j + 1] = temp;
                }
            }
        }

        // 開始放入Max
        for (int i = 0; i < descending_array.length; i++) {
            int local_repeat_times = 0;
            int j = i;
            while (Integer.parseInt(descending_array[j]) == Integer.parseInt(descending_array[i])) {
                local_repeat_times += 1;
                //檢查是否大於歷史值
                if (local_repeat_times > max_repeat_times) {
                    max_repeat_number = Integer.parseInt(descending_array[j]);
                    max_repeat_times = local_repeat_times;
                }
                //檢查會不會超出Array長度
                if (j+1 == descending_array.length) break;
                j += 1;
            }
            local_repeat_times = 0;
        }

        System.out.println(max_repeat_number);
        System.out.println(max_repeat_times);

    }

}