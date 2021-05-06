package exercise3;
public class MediaItem 
{
	private int runTime;

	class Video extends MediaItem {
		private String directior;
		private String genre;
		private int year;
		
		
		public String getDirectior() {
			return directior;
		}
		public void setDirectior(String directior) {
			this.directior = directior;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
		
	}

	class CD extends MediaItem {
		private String artist;
		private String genre;
		
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
}