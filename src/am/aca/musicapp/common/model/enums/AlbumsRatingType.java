package am.aca.musicapp.common.model.enums;

public enum AlbumsRatingType {

	FIVESTAR(5),
	FOURSTAR(4),
	THREESTAR(3),
	TWOSTAR(2),	
	ONESTAR(1);
	
	int albumRatingId;

	private AlbumsRatingType(int albumRatingId) {
		this.albumRatingId = albumRatingId;
	}

	public int getAlbumRatingId() {
		return albumRatingId;
	}

	public void setAlbumRatingId(int albumRatingId) {
		this.albumRatingId = albumRatingId;
	}
}
