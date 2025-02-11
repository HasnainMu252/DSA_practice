import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] rollnum = new int[5];
//
//        for(int i = 0; i<rollnum.length; i++){
//            rollnum[i] = in.nextInt();
//
//        }
//
//        for (int num: rollnum){
//            System.out.println(num + "");
//        }

//        String[] str = new String[6];
//
//        for (int i =0 ; i<str.length;i++){
//            str[i] = in.next();
//
//        }
//
//        System.out.println(Arrays.toString(str));

//        2d Array pracitce

        int[][] array_2d = new int[3][3];
//
//        array_2d[0] = new int[]{2,4,4};
//        array_2d[1] = new int[]{2,4,4};
//        array_2d[2] = new int[]{2,4,4};
//
//
//inputing of 2d array
        for(int row = 0 ; row < array_2d.length ; row++)
            for (int col = 0 ; col <array_2d[0].length;col++)
                array_2d[row][col] = in.nextInt();
//output
     for(int row = 0 ; row < array_2d.length ; row++) {
         System.out.println("");
         for (int col = 0; col < array_2d[row].length; col++)
             System.out.print(array_2d[row][col] + " ");

     }


    }



}