import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class t12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array  = br.readLine().split(" ");
        int ans = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(String str:input_array){
            Integer int_type_str = Integer.parseInt(str);
            Integer temp = hashmap.get(int_type_str);
            if (temp == null) {
                hashmap.put(int_type_str, 1);
            } else {
                hashmap.put(int_type_str,temp+1);
                if (temp + 1 > input_array.length / 2) {
                    ans = int_type_str;
                }
            }
        }
        System.out.println("超過input出現半數的值:"+(ans==0 ? "不存在" : ans));
    }
}