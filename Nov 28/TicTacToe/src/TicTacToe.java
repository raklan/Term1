import java.util.Scanner;
        import java.util.Random;

public class TicTacToe {

    private static Scanner scan = new Scanner(System.in);
    private static Random gen = new Random();

    private static char[][]board;

    public TicTacToe(){
        board = new char[3][3];

        for(int row = 0; row<board.length; row++){
            for(int col = 0; col<board[row].length; col++){
                board[row][col] = '_';
            }
        }
    }

    public void takeTurn(){
        int row = -1;
        int col = -1;

        boolean ok = false;

        do {

            do {
                System.out.println("Which Row Do You Want?");
                row = scan.nextInt()-1;

                if (row > 3) {
                    System.out.println("That is not a valid row. Please choose 0-2");
                    row = -1;
                }

            } while (row == -1);

            do {
                System.out.println("Which Column Do You Want?");
                col = scan.nextInt()-1;

                if (col > 3) {
                    System.out.println("That is not a valid column. Please choose 0-2");
                    col = -1;
                }

            } while (col == -1);

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

    public boolean checkVictory(char ch){
        //Row 1
        if(board[0][0]==ch&&board[0][1]==ch&&board[0][2]==ch)
            return true;
            //Row 2
        else if(board[1][0]==ch&&board[1][1]==ch&&board[1][2]==ch)
            return true;
            //Row 3
        else if(board[2][0]==ch&&board[2][1]==ch&&board[2][2]==ch)
            return true;
            //Col 1
        else if(board[0][0]==ch&&board[1][0]==ch&&board[2][0]==ch)
            return true;
            //Col 2
        else if(board[0][1]==ch&&board[1][1]==ch&&board[2][1]==ch)
            return true;
            //Col 3
        else if(board[0][2]==ch&&board[1][2]==ch&&board[2][2]==ch)
            return true;
            //Top to Right Diagonal
        else if(board[0][0]==ch&&board[1][1]==ch&&board[2][2]==ch)
            return true;
            //Top to Left Diagonal
        else if(board[0][2]==ch&&board[1][1]==ch&&board[2][0]==ch)
            return true;
        else
            return false;
    }


    public void printBoard(){
        for(int row = 0; row<board.length; row++){
            for(int col = 0; col<board[row].length; col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean XWon = false;
        boolean OWon = false;

        TicTacToe ttt = new TicTacToe();

        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("");
        System.out.println("You will be X's. The Computer will be O's");
        System.out.println("");
        System.out.println("Begin");

        ttt.printBoard();

        do{
            ttt.takeTurn();
            ttt.cpuTurn();
            ttt.printBoard();
            if(ttt.checkVictory('X')) {
                XWon = true;
                break;
            }
            else if(ttt.checkVictory('O')) {
                OWon = true;
                break;
            }
        }while(!XWon&&!OWon);

        System.out.println();

        if(XWon)
            System.out.println("Congratulations!");
        else if(OWon)
            System.out.println("Better Luck Next Time");

    }
}