package am.aca.musicapp.repository.interfaces;

import java.util.List;
import am.aca.musicapp.common.model.Song;
import am.aca.musicapp.common.model.SongRating;
import am.aca.onlineshop.common.exception.InvalidArgumentException;

public interface ISongRepository {
 /**


*/
    //storing songs
	public Song addSong(Song song) throws InvalidArgumentException;
	
	public void deleteSong(int songId) throws InvalidArgumentException;
	
	//you can getSong and get Information about songs
	public Song getSong(int songId) throws InvalidArgumentException; 
	
	//public Song getSongInfoBySongId(int songId) same as getSong;
	public void SortBySongRating(List<Song> songs, SongRating songRatingType);
	}
