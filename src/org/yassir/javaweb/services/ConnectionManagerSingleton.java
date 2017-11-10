package org.yassir.javaweb.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionManagerSingleton {

    private static EntityManagerFactory emf;
    private static final ConnectionManagerSingleton cms = new ConnectionManagerSingleton();

    public static ConnectionManagerSingleton getInstance()
    {
        return cms;
    }

    public ConnectionManagerSingleton() {
    }

    public static EntityManagerFactory getEmf() {

        if(emf == null) emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        return emf;
    }

    public static void closeFactory()
    {
        if(emf.isOpen() || emf != null) {
            emf.close();
        }
        emf = null;
    }
}
