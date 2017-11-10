package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Genre implements Serializable
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    //biderectional one to many, this is parent
    @OneToMany(cascade=CascadeType.ALL, mappedBy="genre")
    private List<Song> songList;

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", songList=" + songList +
                '}';
    }

    public Genre(String title, String description, List<Song> songList) {
        this.title = title;
        this.description = description;
        this.songList = songList;
    }

    public Genre(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Genre() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
