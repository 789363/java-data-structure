import java.io.BufferedReader;
import java.io.InputStreamReader;


public class t7 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array = bfReader.readLine().split(",");
        int total = getTotal(input_array);
        System.out.println(total);
    }

    public static int getTotal(String[] input_array){
        int month_paid = Integer.parseInt(input_array[0]);
        double call_time = Integer.parseInt(input_array[1]);
        double rate = 0.09;
        double notoverrate = 0.9;
        double overrate = 0.8;


        if (month_paid == 186) {
             rate = 0.09;
             notoverrate = 0.9;
             overrate = 0.8;
        }
        if (month_paid == 386) {
             rate = 0.08;
             notoverrate = 0.8;
             overrate = 0.7;
        }
        if (month_paid == 586) {
             rate = 0.07;
             notoverrate = 0.7;
             overrate = 0.6;
        }
        if (month_paid == 986) {
             rate = 0.06;
             notoverrate = 0.6;
             overrate = 0.5;
        }
        int total = (int)Math.round(call_time * rate);

        if (total < month_paid*2 && total > month_paid) {
            return (int)Math.round(total * notoverrate);
        }


        if (total > month_paid*2) {
            return (int)Math.round(total * overrate);
        }

        return month_paid;
    }
}