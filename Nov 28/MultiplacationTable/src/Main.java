import java.util.Random;
public class Main {

    private static int[][]timesTable = new int[12][12];

    public static void fillTable(){
        for(int row = 1; row<timesTable.length; row++){
            for(int col = 1; col<timesTable[row].length; col++){
                timesTable[row][col] = row*col;
            }
        }
    }
    public static void printTable(){
        for(int row = 1; row<timesTable.length; row++){
            for(int col = 1; col<timesTable[row].length; col++){
                System.out.print(timesTable[row][col]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fillTable();
        printTable();
    }
}