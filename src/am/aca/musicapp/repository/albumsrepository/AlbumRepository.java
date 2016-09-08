package am.aca.musicapp.repository.albumsrepository;


import am.aca.musicapp.common.model.Album;
import am.aca.musicapp.repository.interfaces.IAlbumRepository;
import am.aca.musicapp.repository.interfaces.ISongRepository;
import am.aca.onlineshop.common.exception.InvalidArgumentException;

public class AlbumRepository implements IAlbumRepository{

	private static IAlbumRepository instance;
	private AlbumRepository(){}
	public static AlbumRepository getInstance(){
		return (AlbumRepository) instance;
	}
	
	@Override
	public Album addNewAlbum(Album album) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAlbum(int albumId) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Album getAlbum(int albumId) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album editAlbum(Album album) throws InvalidArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
