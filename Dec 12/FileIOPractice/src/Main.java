import java.io.*;
//import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        writeToFile();
        readFromFile();
        System.out.println();
        ArrayList<String>theList = new ArrayList<String>();
        fileToArray(theList);
        printArray(theList);
        arrayToFile(theList);

        saveData();
        readData();

    }

    private static void fileToArray(ArrayList<String>list){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Phrases.txt"));

            String line;
            do {
                line = reader.readLine();
                if(line != null)
                    list.add(line+"\r\n");
            }while(line != null);
            reader.close();
        }catch(IOException e){
            System.out.println("Error: File could not be copied to ArrayList");
            e.printStackTrace();
        }
    }

    private static void printArray(ArrayList<String>list){
        for(String s: list)
            System.out.print(s);
    }

    private static void arrayToFile(ArrayList<String>list){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Phrases.txt"));

            for(String s: list)
                writer.write(s);
            writer.close();
        }catch(IOException e){
            System.out.println("Error: ArrayList could not be copied to file");
            e.printStackTrace();
        }
    }

    private static void writeToFile(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Phrases.txt"));

            writer.write("Spartans Spar\r\n");
            writer.write("Once upon a time\r\n");
            writer.write("A picture is worth a thousand words\r\n");
            writer.write("We are embarking on a journey\r\n");
            writer.write("You better not say that.\r\n");

            writer.close();

        }catch(IOException e){
            System.out.println("Error: Couldn't write to file.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Phrases.txt"));

            String line;
            do {
                line = reader.readLine();
                if(line != null)
                    System.out.println(line);
            }while(line != null);
            reader.close();
        }catch(IOException e){
            System.out.println("Error: Couldn't Read from File");
            e.printStackTrace();
        }
    }

    public static void saveData(){

        try {
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("info.txt"));

            dataOut.writeInt(4);
            dataOut.writeDouble(5.3);
            dataOut.writeBoolean(true);
            dataOut.close();

        }catch(IOException e){
            System.out.println("Error: Could not write to file");
            e.printStackTrace();
        }
    }

    public static void readData(){
        try {

            DataInputStream dataIn = new DataInputStream(new FileInputStream("info.txt"));

            int i = dataIn.readInt();
            double d = dataIn.readDouble();
            boolean b = dataIn.readBoolean();
            System.out.println(i);

            dataIn.close();

        }catch(IOException e){
            System.out.println("Error: Could not read from file");
            e.printStackTrace();
        }
    }
}