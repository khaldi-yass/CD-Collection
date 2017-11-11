package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.Genre;
import org.yassir.javaweb.services.interfaces.GenreServices;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class GenreServicesImpl implements GenreServices, Serializable
{
    @Override
    public int addGenre(Genre genre) {
        return 0;
    }

    @Override
    public Genre getGenre(Genre genre) {
        return null;
    }

    @Override
    public Genre getGenre(int id) {
        return null;
    }

    @Override
    public List<Genre> getListGenres() {
        return null;
    }

    @Override
    public List<Genre> getListGenres(int maxResults) {
        return null;
    }

    @Override
    public List<Genre> getListGenres(TypedQuery<Genre> query) {
        return null;
    }

    @Override
    public int updateGenre(Genre genre) {
        return 0;
    }

    @Override
    public int deleteGenre(Genre genre) {
        return 0;
    }

    @Override
    public int deleteGenre(int id) {
        return 0;
    }
}
