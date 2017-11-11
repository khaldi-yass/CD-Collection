package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.CD;
import org.yassir.javaweb.services.interfaces.CDServices;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class CDServicesImpl implements CDServices, Serializable
{
    @Override
    public int addCD(CD cd) {
        return 0;
    }

    @Override
    public CD getCD(CD cd) {
        return null;
    }

    @Override
    public CD getCD(int id) {
        return null;
    }

    @Override
    public List<CD> getListCDs() {
        return null;
    }

    @Override
    public List<CD> getListCDs(int maxResults) {
        return null;
    }

    @Override
    public List<CD> getListCDs(TypedQuery<CD> query) {
        return null;
    }

    @Override
    public int updateCD(CD cd) {
        return 0;
    }

    @Override
    public int deleteCD(CD cd) {
        return 0;
    }

    @Override
    public int deleteCD(int id) {
        return 0;
    }
}
