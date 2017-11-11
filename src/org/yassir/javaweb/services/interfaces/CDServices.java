package org.yassir.javaweb.services.interfaces;

import org.yassir.javaweb.entities.CD;

import javax.persistence.TypedQuery;
import java.util.List;

public interface CDServices
{
    //Simple CRUD Ops

    //create ********************************
    public int addCD(CD cd);

    //read **********************************
    public CD getCD(CD cd);
    public CD getCD(int id);
    public List<CD> getListCDs();
    public List<CD> getListCDs(int maxResults);
    public List<CD> getListCDs(TypedQuery<CD> query);

    //update
    public int updateCD(CD cd);

    //Delete
    public int deleteCD(CD cd);
    public int deleteCD(int id);
}
