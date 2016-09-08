package am.aca.musicapp.common.model;

import am.aca.musicapp.common.model.enums.SongGenre;

public class Song {
	
	private SongRating songRating;
	private SongGenre songGenre;
	private String songName;
	private int musicId;
	Author author;
	
	public SongRating getSongRating() {
		return songRating;
	}
	public void setSongRating(SongRating songRating) {
		this.songRating = songRating;
	}
	public SongGenre getSongGenre() {
		return songGenre;
	}
	public void setSongGenre(SongGenre songGenre) {
		this.songGenre = songGenre;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getMusicId() {
		return musicId;
	}
	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Song(SongRating songRating, SongGenre songGenre, String songName, int musicId, Author author) {
		super();
		this.songRating = songRating;
		this.songGenre = songGenre;
		this.songName = songName;
		this.musicId = musicId;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Song [songRating=" + songRating + ", songGenre=" + songGenre + ", songName=" + songName + ", musicId="
				+ musicId + ", author=" + author + "]";
	}
	
}
