package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.Artist;
import org.yassir.javaweb.services.interfaces.ArtistServices;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArtistServicesImpl implements ArtistServices, Serializable
{
    @Override
    public int addArtist(Artist artist) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(artist);
        tx.commit();
        em.close();

        return 1;
    }

    @Override
    public Artist getArtist(Artist artist) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Artist artist1 = new Artist();
        TypedQuery<Artist> query = em.createQuery(
                "select a from Artist a where a.id = :id",
                Artist.class);
        query.setParameter("id", artist.getId());

        tx.begin();
        artist1 = query.getSingleResult();
        tx.commit();
        em.close();

        return artist1;
    }

    @Override
    public Artist getArtist(int id) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Artist artist1 = new Artist();
        TypedQuery<Artist> query = em.createQuery(
                "select a from Artist a where a.id = :id",
                Artist.class);
        query.setParameter("id", id);

        tx.begin();
        artist1 = query.getSingleResult();
        tx.commit();
        em.close();

        return artist1;
    }

    @Override
    public List<Artist> getListArtists() {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        List<Artist> artistList = new ArrayList<Artist>();
        TypedQuery<Artist> query = em.createQuery(
                    "select a from Artist a",
                        Artist.class);


        tx.begin();
        artistList = query.getResultList();
        tx.commit();
        em.close();

        return artistList;
    }

    @Override
    public List<Artist> getListArtists(int maxResults) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        List<Artist> artistList = new ArrayList<Artist>();
        TypedQuery<Artist> query = em.createQuery(
                "select a from Artist a",
                Artist.class);
        query.setMaxResults(maxResults);

        tx.begin();
        artistList = query.getResultList();
        tx.commit();
        em.close();

        return  artistList;
    }

    @Override
    public List<Artist> getListArtists(String JpaQuery) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        List<Artist> artistList = new ArrayList<Artist>();
        TypedQuery<Artist> query = em.createQuery(JpaQuery, Artist.class);

        tx.begin();
        artistList = query.getResultList();
        tx.commit();
        em.close();

        return artistList;
    }

    @Override
    public int updateArtist(Artist artist) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(em.find(Artist.class, artist.getId()) == null){
            throw new IllegalArgumentException("Unknown Artist id");
        }
        else
        {
            tx.begin();
            em.merge(artist);
            tx.commit();
            em.close();
        }

        return 1;
    }

    @Override
    public int deleteArtist(Artist artist) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Artist artist1 = em.find(Artist.class, artist.getId());

        if(artist1 == null){
            throw new IllegalArgumentException("Unknown Artist id");
        }
        else
        {
            tx.begin();
            em.remove(artist1);
            tx.commit();
            em.close();
        }

        return 1;
    }

    @Override
    public int deleteArtist(int id) {

        EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Artist artist1 = em.find(Artist.class, id);

        if(artist1 == null){
            throw new IllegalArgumentException("Unknown Artist id");
        }
        else
        {
            tx.begin();
            em.remove(artist1);
            tx.commit();
            em.close();
        }

        return 1;
    }
}
