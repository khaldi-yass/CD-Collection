package org.yassir.javaweb.services.interfaces;

import org.yassir.javaweb.entities.RecordCompany;

import javax.persistence.TypedQuery;
import java.util.List;

public interface RecordCompanyServices
{
    //Simple CRUD Ops

    //create ********************************
    public int addRecordCompany(RecordCompany recComp);

    //read **********************************
    public RecordCompany getRecordCompany(RecordCompany recComp);
    public RecordCompany getRecordCompany(int id);
    public List<RecordCompany> getListRecordCompanys();
    public List<RecordCompany> getListRecordCompanys(int maxResults);
    public List<RecordCompany> getListRecordCompanys(TypedQuery<RecordCompany> query);

    //update
    public int updateRecordCompany(RecordCompany recComp);

    //Delete
    public int deleteRecordCompany(RecordCompany recComp);
    public int deleteRecordCompany(int id);
}
