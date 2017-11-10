package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity @Table(name = "songs")
public class Song implements Serializable
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "track_number")
    private int trackNumber;
    private String title;

    //bidirectional many to one, this is child
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name="genre_id")
    private Genre genre;

    private float length;
    private String details;

    //bidirectional manytoone, this is child
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name="cd_id")
    private CD cdAlbum;

    // Bidirectional many to many,  this is parent
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "songList")
    private List<Artist> artists;

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", trackNumber=" + trackNumber +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", length=" + length +
                ", details='" + details + '\'' +
                ", cdAlbum=" + cdAlbum +
                ", artists=" + artists +
                '}';
    }

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

    public CD getCdAlbum() {
        return cdAlbum;
    }

    public void setCdAlbum(CD cdAlbum) {
        this.cdAlbum = cdAlbum;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Song() {

    }

    public Song(int trackNumber, String title, Genre genre, float length, String details, CD cdAlbum, List<Artist> artists) {

        this.trackNumber = trackNumber;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.details = details;
        this.cdAlbum = cdAlbum;
        this.artists = artists;
    }

    public Song(int trackNumber, String title, Genre genre, float length, String details, List<Artist> artists) {

        this.trackNumber = trackNumber;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.details = details;
        this.cdAlbum = cdAlbum;
        this.artists = artists;
    }
}
