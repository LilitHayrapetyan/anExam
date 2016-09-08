package am.aca.musicapp.repository.songrepository;

import java.util.List;

import am.aca.musicapp.common.model.Song;
import am.aca.musicapp.common.model.SongRating;
import am.aca.musicapp.repository.interfaces.ISongRepository;
import am.aca.onlineshop.common.exception.InvalidArgumentException;


public class SongRepository implements ISongRepository{

	private static ISongRepository instance;
	private SongRepository(){}
	public static ISongRepository getInstance(){
		return (ISongRepository) instance;
	}
	
	@Override
	public Song addSong(Song song) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSong(int songId) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Song getSong(int songId) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void SortBySongRating(List<Song> songs, SongRating songRatingType) {
		// TODO Auto-generated method stub
		
	}

}
