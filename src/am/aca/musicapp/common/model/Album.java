package am.aca.musicapp.common.model;

import java.util.List;

public class Album {

	private String albumName;
	private Author author; 
	private List<Song> musicList;
	private int albumId;
	
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public List<Song> getMusicList() {
		return musicList;
	}
	public void setMusicList(List<Song> musicList) {
		this.musicList = musicList;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public Album(String albumName, Author author, List<Song> musicList, int albumId) {
		super();
		this.albumName = albumName;
		this.author = author;
		this.musicList = musicList;
		this.albumId = albumId;
	}
	@Override
	public String toString() {
		return "Album [albumName=" + albumName + ", author=" + author + ", musicList=" + musicList + ", albumId="
				+ albumId + "]";
	}
	
}
