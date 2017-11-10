package org.yassir.javaweb.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private Date birth;
    private float height;
    private float weight;

    // Unidirectional One to one,  this is child
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_photo", nullable = false)
    private Photo photo;

    // Bidirectional many to many,  this is child
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "artists_songs",
                joinColumns = @JoinColumn(name = "artist_id"),
                inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songList;

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", height=" + height +
                ", weight=" + weight +
                ", photo=" + photo +
                ", songList=" + songList +
                '}';
    }

    public Artist(String name, String gender, Date birth, float height, float weight, Photo photo, List<Song> songList) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.height = height;
        this.weight = weight;
        this.photo = photo;
        this.songList = songList;
    }

    public Artist(String name, String gender, Date birth, float height, float weight, Photo photo) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.height = height;
        this.weight = weight;
        this.photo = photo;
    }

    public Artist() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
