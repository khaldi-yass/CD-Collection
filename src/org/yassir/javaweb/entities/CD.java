package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity @Table(name = "CDs")
public class CD implements Serializable
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     // Unidirectional One to one,  this is child
    @OneToOne(cascade = CascadeType.ALL) @JoinColumn(name = "id_cover", nullable = false)
    private Photo cover;

    // bidirectional One to many,  this is child
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name="id_record_company")
    private RecordCompany recordCompany;

    private String title;
    private double cost;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "number_of_tracks")
    private int numberOfTracks;
    @Column(name = "total_playing_time")
    private float totalPlayingTime;

    // Unidirectional many to many,  this is child
    @ManyToMany (cascade=CascadeType.ALL)
    @JoinTable( name="artists_cds",
                joinColumns=@JoinColumn(name="cd_id"),
                inverseJoinColumns=@JoinColumn(name="artist_id"))
    private List<Artist> artistList;


    // Bidirectional many to one,  this is parent
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "cdAlbum")
    private List<Song> songList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Photo getCover() {
        return cover;
    }

    public void setCover(Photo cover) {
        this.cover = cover;
    }

    public RecordCompany getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(RecordCompany recordCompany) {
        this.recordCompany = recordCompany;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public float getTotalPlayingTime() {
        return totalPlayingTime;
    }

    public void setTotalPlayingTime(float totalPlayingTime) {
        this.totalPlayingTime = totalPlayingTime;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public CD() {

    }

    public CD(Photo cover, RecordCompany recordCompany, String title, double cost, Date releaseDate, int numberOfTracks, float totalPlayingTime, List<Artist> artistList, List<Song> songList) {

        this.cover = cover;
        this.recordCompany = recordCompany;
        this.title = title;
        this.cost = cost;
        this.releaseDate = releaseDate;
        this.numberOfTracks = numberOfTracks;
        this.totalPlayingTime = totalPlayingTime;
        this.artistList = artistList;
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", cover=" + cover +
                ", recordCompany=" + recordCompany +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", releaseDate=" + releaseDate +
                ", numberOfTracks=" + numberOfTracks +
                ", totalPlayingTime=" + totalPlayingTime +
                ", artistList=" + artistList +
                ", songList=" + songList +
                '}';
    }
}
