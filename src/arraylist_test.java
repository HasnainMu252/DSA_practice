import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < 5 ;i++){
            list.add(in.nextInt());

        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));  // we cannot use list[index] in this arraylist functon its invalid here
        }

    }

}
