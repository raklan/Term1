import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    private static Scanner scan = new Scanner(System.in);
    private static Random gen = new Random();

    private char[][]board;

    public TicTacToe(){
        board = new char[3][3];

        for(int row = 0; row<board.length; row++){
            for(int col = 0; col<board[row].length; col++){
                board[row][col] = '_';
            }
        }

    }

    public void takeTurn(){
        int row;
        int col;

        boolean ok = false;

        do {

            do {
                System.out.println("Which Row Do You Want?");
                row = scan.nextInt();

                if (row > 2) {
                    System.out.println("That is not a valid row. Please choose 0-2");
                    row = 0;
                }

            } while (row == 0);

            do {
                System.out.println("Which Column Do You Want?");
                col = scan.nextInt();

                if (col > 2) {
                    System.out.println("That is not a valid column. Please choose 0-2");
                    col = 0;
                }

            } while (col == 0);

            if(board[row][col]!='_'){
                System.out.println("That spot is already taken. Try a different one.");
                row = 0;
                col = 0;
            }
            else
                ok = true;

        }while(!ok);

        board[row][col] = 'X';

    }

    public void cpuTurn(){
        int row;
        int col;

        boolean ok = false;

        do {

            do {
                row = gen.nextInt(3);

                if (row > 2) {
                    row = 0;
                }

            } while (row == 0);

            do {
                col = gen.nextInt(3);

                if (col > 2) {
                    col = 0;
                }

            } while (col == 0);

            if(board[row][col]!='_'){
                row = 0;
                col = 0;
            }
            else
                ok = true;

        }while(!ok);

        board[row][col] = 'O';
    }

    public void checkVictory(){

    }

    public static void main(String[] args) {

    }
}
