public class Song {

    private String name;
    private String album;
    private String artist;


    public Song(String n, String al, String ar){

        name = n;
        album = al;
        artist = ar;

    }
    public String getName(){
        return name;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String toString(){
        return "\""+name+"\" is by "+artist+" from the album \""+album+"\"";
    }
}
