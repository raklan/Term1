public class Main {

	public static void main(String[] args) {
		Song whatIDun = new Song("What I've Done", "Minutes to Midnight", "Linkin Park");
		Song beer = new Song("Another Irish Drinking Song","Brontosaurus","Davinci's Notebook");
		Song ramaLama = new Song("Rama Lama Ding Dong", "Rama Lama Ding Dong","The Edsels");

		System.out.println(whatIDun.toString());
		System.out.println(beer.toString());
		System.out.println(ramaLama.toString());

		System.out.println(ramaLama.getName()+" is by "+ramaLama.getArtist());
		System.out.println(beer.getName()+" is from the album "+beer.getAlbum());

		whatIDun.setAlbum("Not Minutes to Midnight");
		beer.setArtist("Not Davinci's Notebook");
		ramaLama.setName("Not Rama Lama Ding Dong");
	}
}
