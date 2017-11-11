package org.yassir.javaweb.services.interfaces;

import org.yassir.javaweb.entities.Song;

import javax.persistence.TypedQuery;
import java.util.List;

public interface SongServices
{
    //Simple CRUD Ops

    //create ********************************
    public int addSong(Song song);

    //read **********************************
    public Song getSong(Song song);
    public Song getSong(int id);
    public List<Song> getListSongs();
    public List<Song> getListSongs(int maxResults);
    public List<Song> getListSongs(TypedQuery<Song> query);

    //update
    public int updateSong(Song song);

    //Delete
    public int deleteSong(Song song);
    public int deleteSong(int id);
}
