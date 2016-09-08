package am.aca.musicapp.common.model.enums;

public enum SongGenre {

	ROCK(1),
	HARDROCK(2),
	CLASSICAL(3),
	FOLK(4),
	OPERA(5);
	int songGenreId;

	public int getSongGenreId() {
		return songGenreId;
	}

	public void setSongGenreId(int songGenreId) {
		this.songGenreId = songGenreId;
	}

	private SongGenre(int songGenreId) {
		this.songGenreId = songGenreId;
	}
	
}
