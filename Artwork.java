 public class Artwork {

	private String title;
	private int year;
	private Artist artist;

	Artwork(String title, int year , Artist artist){
		this.title=title;
		this.year= year;
		this.artist=artist;
	}
	
	Artwork(String title, int year){
		this.title=title;
		this.year=year;
		this.artist = artist;
	}
	
	Artwork(Artwork artwork){
		this.title=artwork.getTitle();
		this.year=artwork.getYear();
		this.artist=artwork.getArtist(); // Shallow Copy
		this.artist=new Artist (artwork.getArtist()); // Deep copy 
	}

	public String getTitle(){
	return title;
	}

	public int getYear(){
	return year;
	}


	public Artist getArtist(){
	return artist;
	}

 }