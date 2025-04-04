import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

//    public Boolean checkRows(String row) {
//        // Check if number is present in the row
//    }
//
//    public Boolean checkCols(String col) {
//        // Check if number is present in the column
//    }
//
//    public Boolean checkGrid(String grid) {
//        // Check if number is present in the grid
//    }



    public static void main(String[] args) {

            Scanner input  = new Scanner(System.in);

            // Get number of puzzles
            int puzzles = input.nextInt();

            System.out.println();
            // Constructs a 9X9 2D array based off the user's input
            for(int i = 0; i <= puzzles; i++) {

                char[][] board = new char[9][9];
                for (int j = 0; j < 9; j++) {
                    String data = "";
                    if (input.hasNext()) {
                        data = input.next();
                    } else {
                        break;
                    }
                    for (int k = 0; k < 9; k++) {
                        board[j][k] = data.charAt(k);
                        System.out.print("[" + board[j][k] + "]" + ",");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            input.close();








}
}

// Test Input
//3
//________4
//1____9_7_
//__37_28__
//        ____7_26_
//4_______8
//_91_6____
//        __42_36__
//_3_14___9
//9________
//        7_9__2___
//        3_____891
//___39___4
//48__6____
//__5___6__
//        ____4__23
//2___57___
//        568_____7
//___8__4_2
//82_______
//___5__2__
//        __6_4_7__
//_5___1_7_
//9_2_5_4_1
//_3_8_6_9_
//        __3_6_1__
//__5__2___
//        _______34
