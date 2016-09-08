package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.common.model.Album;
import am.aca.onlineshop.common.exception.InvalidArgumentException;

public interface IAlbumRepository {

	String AlbumsDataBase = "AlbumsDataBase";
	//Opportunity to import new albums
	public Album addNewAlbum(Album album) throws InvalidArgumentException;
	public void deleteAlbum(int albumId) throws InvalidArgumentException;
	public Album getAlbum(int albumId) throws InvalidArgumentException; 
	//replace some songs from Album
	public Album editAlbum(Album album, List<Song> existingSongs, List<Song> newListOfSongs) throws InvalidArgumentException;

}
