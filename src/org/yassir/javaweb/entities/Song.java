package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity @Table(name = "songs")
public class Song implements Serializable
{

    public Song() {
    }

    public Song(int trackNumber, String title, Genre genre, float length, String details, List<Artist> artists) {
        this.trackNumber = trackNumber;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.details = details;
        this.artists = artists;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "track_number")
    private int trackNumber;
    private String title;
    private Genre genre;
    private float length;
    private String details;

    @ElementCollection(targetClass=Artist.class)
    private List<Artist> artists;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", trackNumber=" + trackNumber +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", length=" + length +
                ", details='" + details + '\'' +
                ", artists=" + artists +
                '}';
    }
}
