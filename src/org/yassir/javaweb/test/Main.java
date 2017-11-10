package org.yassir.javaweb.test;

import org.yassir.javaweb.entities.Artist;
import org.yassir.javaweb.entities.Genre;
import org.yassir.javaweb.entities.Photo;
import org.yassir.javaweb.services.ConnectionManagerSingleton;
import org.yassir.javaweb.services.ConnectionManagerSingleton;
import org.yassir.util.YassirUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Starting ....");

        System.out.println("Entity Manager created ...");


        for (int i = 0; i < 10; i++) {

            Date date = YassirUtils.localDateToDateUtil(YassirUtils.createDate(i+1, i+1, 2010+i));
            Photo photo = new Photo("Yassir"+i, "This is yassir"+i, "photos/yassir"+i+".png");
            Artist artist = new Artist("Yassir", "Male", date, 1.8f, 75f, photo);

            EntityManager em = ConnectionManagerSingleton.getInstance().getEmf().createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(artist);
            tx.commit();
            em.close();

            System.out.println("Artiste ajouté");
        }


        //ConnectionManagerSingleton.closeFactory();
        System.out.println("Closed...");
    }

}
