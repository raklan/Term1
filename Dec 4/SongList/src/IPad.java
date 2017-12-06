import java.util.Scanner;
import java.util.ArrayList;
public class IPad {

    private ArrayList<Song> songList;

    private static Scanner scan = new Scanner(System.in);

    public IPad(){
         songList = new ArrayList<Song>();
         songList.add(new Song("What is Love?", "What is Love?", "Loverboy"));
         songList.add(new Song("American Pie", "American Pie", "Donny McLean"));
         songList.add(new Song("Come and Get Your Love", "Wovoka", "Redbone"));

         System.out.println(songList);

         songList.set(0, new Song("Another Irish Drinking Song", "Brontosaurus", "DaVinci's Notebook"));

        this.addNewSongs();

        this.searchSongs();

        this.getAllSongs();
    }

    public void getAllSongs(){
        for(Song s: songList){
            System.out.print(s.toString()+", ");
        }
    }
    public void addNewSongs(){
        boolean done = false;
        String input = "";

        System.out.println("Would you like to add another song? (Y/N) ");

        while(!done){

            input = scan.nextLine();

            String name;
            String album;
            String artist;

            if(input.equalsIgnoreCase("Y")){
                System.out.println("Please enter the NAME of the song:");
                name = scan.nextLine();
                System.out.println("Please enter the ALBUM of the song:");
                album = scan.nextLine();
                System.out.println("Please enter the ARTIST of the song:");
                artist = scan.nextLine();

                songList.add(new Song(name, album, artist));

                done = false;

            }
            else if(input.equalsIgnoreCase("N")){
                System.out.println("Exiting Song Entering Mode...");
                done = true;
                break;
            }
            else{
                System.out.println("That's not a valid choice. Please enter (Y)Yes or (N)No");
                done = false;
                continue;
            }

            System.out.println("Would you like to add another song? (Y/N) ");

        }
    }

    public void searchSongs(){

        String input = "Y";
        boolean done = false;
        boolean found = false;
        Song theFound = null;

        while(!done){
            if(input.equalsIgnoreCase("Y")) {
                System.out.println("Enter the Name of the Song you want to search for:");
                input = scan.nextLine();

                for(Song s: songList){
                    if(s.getName().equalsIgnoreCase(input)) {
                        found = true;
                        theFound = s;
                    }
                }

                if(found){
                    System.out.println("Song Found:");
                    System.out.println(theFound.toString());
                }
                else
                    System.out.println("Song not found");

            }
            else if(input.equalsIgnoreCase("N")){
                System.out.println("Exiting Song Search Mode...");
                done = true;
                break;
            }
            else{
                System.out.println("That's not a valid choice. Please enter (Y)Yes or (N)No");
                done = false;
                continue;
            }

            System.out.println("Search For Another Song?");
            input = scan.nextLine();

        }

    }

    public static void main(String[] args) {
        IPad theTabletofDeath = new IPad();
    }
}
