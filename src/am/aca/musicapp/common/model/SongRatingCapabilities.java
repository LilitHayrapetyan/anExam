package am.aca.musicapp.common.model;

public class SongRatingCapabilities {
	
	Song song;
	SongRating songRating;
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public SongRating getSongRating() {
		return songRating;
	}
	public void setSongRating(SongRating songRating) {
		this.songRating = songRating;
	}
	
	public SongRating getSongRating(Song song){
		this.song=song;
		return songRating;
		
	}
}
