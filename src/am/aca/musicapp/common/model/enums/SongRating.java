package am.aca.musicapp.common.model.enums;

public enum SongRating {

	FIVESTAR(5),
	FOURSTAR(4),
	THREESTAR(3),
	TWOSTAR(2),
	ONESTAR(1);
	int SongRatingId;
	
	private SongRating(int songRatingId) {
		SongRatingId = songRatingId;
	}

	public int getSongRatingId() {
		return SongRatingId;
	}

	public void setSongRatingId(int songRatingId) {
		SongRatingId = songRatingId;
	}

	
	
}
