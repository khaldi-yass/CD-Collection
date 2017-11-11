package org.yassir.javaweb.services.interfaces;

import org.yassir.javaweb.entities.Genre;

import javax.persistence.TypedQuery;
import java.util.List;

public interface GenreServices
{
    //Simple CRUD Ops

    //create ********************************
    public int addGenre(Genre genre);

    //read **********************************
    public Genre getGenre(Genre genre);
    public Genre getGenre(int id);
    public List<Genre> getListGenres();
    public List<Genre> getListGenres(int maxResults);
    public List<Genre> getListGenres(TypedQuery<Genre> query);

    //update
    public int updateGenre(Genre genre);

    //Delete
    public int deleteGenre(Genre genre);
    public int deleteGenre(int id);
}
