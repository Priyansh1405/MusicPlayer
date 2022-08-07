package priyansh;
import java.util.*;
public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public Album() {
		
	}
	
	public Song findSong(String title)
	{
		for(Song song : songs)
		{
			if(song.getTitle().equals(title))
			{
				return song;
			}
		}
		
		return null;
	}
	
	public boolean addSong(String title, double duration)
	{
		if(findSong(title) == null)
		{
			songs.add(new Song(title, duration));
//			System.out.println(title + "Song successfully added ");
			return true;
		}	
		else
		{
			System.out.println("Song with name" + title + " already exists!");
			return false;
		}
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList)
	{
		int index = trackNumber - 1;
		
		if(index >= 0 && index < this.songs.size())
		{
			PlayList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have song with track number : " + trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> PlayList)
	{
		for(Song listSong : this.songs)
		{
			if(listSong.getTitle().equals(title))
			{
				PlayList.add(listSong);
				return true;
			}
		}
		System.out.println("This album does not have song with title : " + title);
		return false;
	}

}
