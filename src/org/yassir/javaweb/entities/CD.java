package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity @Table(name = "CDs")
public class CD implements Serializable
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Genre genre;
    private Photo cover;
    @Column(name = "record_company")
    private RecordCompany recordCompany;
    private String title;
    private double cost;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "number_of_tracks")
    private int numberOfTracks;
    @Column(name = "total_playing_time")
    private float totalPlayingTime;

    @ElementCollection(targetClass=Artist.class)
    private List<Artist> artistList;
    @ElementCollection(targetClass=Song.class)
    private List<Song> songList;
}
