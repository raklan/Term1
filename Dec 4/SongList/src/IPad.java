import java.util.ArrayList;
public class IPad {

    private ArrayList<Song> songList;

    public IPad(){
         songList = new ArrayList<Song>();
         songList.add(new Song("What is Love?", "What is Love?", "Loverboy"));
         songList.add(new Song("American Pie", "American Pie", "Donny McLean"));
         songList.add(new Song("Come and Get Your Love", "Wovoka", "Redbone"));

         System.out.println(songList);

         songList.set(0, new Song("Another Irish Drinking Song", "Brontosaurus", "DaVinci's Notebook"));

         String title = songList.get(1).getName().toUpperCase();

         System.out.println(title);

        Song trial = songList.get(1);
        trial.setName("New Name");

        System.out.println(songList);

    }

    public static void main(String[] args) {
        IPad theTabletofDeath = new IPad();
    }
}
