package org.yassir.javaweb.test;

import org.yassir.javaweb.entities.*;
import org.yassir.javaweb.services.ConnectionManagerSingleton;
import org.yassir.javaweb.services.ConnectionManagerSingleton;
import org.yassir.util.YassirUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Starting ....");
        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();

        List<Artist> artistList = new ArrayList<Artist>();
        List<Photo> artistsPhotos = new ArrayList<Photo>();
        List<RecordCompany> recordCompanies = new ArrayList<RecordCompany>();
        List<CD> cdList = new ArrayList<CD>();
        List<Genre> genreList = new ArrayList<Genre>();
        List<Photo> coversPhotos = new ArrayList<Photo>();
        List<Song> songList = new ArrayList<Song>();

        //creating 3 artists
        for (int i = 1; i < 4; i++) {

            Date birth = YassirUtils.localDateToDateUtil(YassirUtils.createDate(i+1, i+1, 2017+i));
            Photo photo = new Photo("Photo"+i, "Photos details", "artists/photo"+i+".jpg");
            Artist artist = new Artist("Artist"+i,"Male", birth, 1.8f, 70f, photo);

            artistsPhotos.add(photo);
            artistList.add(artist);
        }
        System.out.println("Liste artists - Photos Artists: créé..");

        //creating 3 genres
        for (int i = 1; i < 4; i++) {

            Genre genre = new Genre("Genre"+i, "Desc");
            genreList.add(genre);

        }
        System.out.println("Liste artists - Photos Artists: créé..");

         //creating 3 songs
        for (int i = 1; i < 4; i++) {

            Song song = new Song(i, "SongTitle", genreList.get(i-1), 3.5f, "Details", artistList);
            songList.add(song);
        }
        System.out.println("Liste songs: créé..");

        //creating 2 record companies
        RecordCompany recordCompany = new RecordCompany("Comp1", "Adress1", "Details1");
        recordCompanies.add(recordCompany);
        System.out.println("Liste Record comps: créé..");

        //creating 1 album
        Photo cover1 = new Photo("Cover", "Photos details", "covers/cover1.jpg");
        CD album1 = new CD(cover1, recordCompany, "AlbumTitle", 12, new Date(), 3, 20, artistList, songList);
        cdList.add(album1);
        coversPhotos.add(cover1);
        System.out.println("Liste CDs créé");

        artistList.get(0).setSongList(songList);
        genreList.get(0).setSongList(songList);
        songList.get(0).setCdAlbum(album1);
        recordCompanies.get(0).setCdList(cdList);

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(album1);
        tx.commit();
        em.close();
        //ConnectionManagerSingleton.closeFactory();
        System.out.println("Closed...");
    }

}
