package org.yassir.javaweb.services.interfaces;

import org.yassir.javaweb.entities.Artist;

import javax.persistence.TypedQuery;
import java.util.List;

public interface ArtistServices
{
    //Simple CRUD Ops

    //create ********************************
    public int addArtist(Artist artist);

    //read **********************************
    public Artist getArtist(Artist artist);
    public Artist getArtist(int id);
    public List<Artist> getListArtists();
    public List<Artist> getListArtists(int maxResults);
    public List<Artist> getListArtists(String JpaQuery);

    //update
    public int updateArtist(Artist artist);

    //Delete
    public int deleteArtist(Artist artist);
    public int deleteArtist(int id);
}
