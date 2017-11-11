package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.Song;
import org.yassir.javaweb.services.interfaces.SongServices;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class SongServicesImpl implements SongServices, Serializable
{
    @Override
    public int addSong(Song song) {
        return 0;
    }

    @Override
    public Song getSong(Song song) {
        return null;
    }

    @Override
    public Song getSong(int id) {
        return null;
    }

    @Override
    public List<Song> getListSongs() {
        return null;
    }

    @Override
    public List<Song> getListSongs(int maxResults) {
        return null;
    }

    @Override
    public List<Song> getListSongs(TypedQuery<Song> query) {
        return null;
    }

    @Override
    public int updateSong(Song song) {
        return 0;
    }

    @Override
    public int deleteSong(Song song) {
        return 0;
    }

    @Override
    public int deleteSong(int id) {
        return 0;
    }
}
