package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.Artist;
import org.yassir.javaweb.services.interfaces.ArtistServices;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class ArtistServicesImpl implements ArtistServices, Serializable
{
    @Override
    public int addArtist(Artist artist) {
        return 0;
    }

    @Override
    public Artist getArtist(Artist artist) {
        return null;
    }

    @Override
    public Artist getArtist(int id) {
        return null;
    }

    @Override
    public List<Artist> getListArtists() {
        return null;
    }

    @Override
    public List<Artist> getListArtists(int maxResults) {
        return null;
    }

    @Override
    public List<Artist> getListArtists(TypedQuery<Artist> query) {
        return null;
    }

    @Override
    public int updateArtist(Artist artist) {
        return 0;
    }

    @Override
    public int deleteArtist(Artist artist) {
        return 0;
    }

    @Override
    public int deleteArtist(int id) {
        return 0;
    }
}
