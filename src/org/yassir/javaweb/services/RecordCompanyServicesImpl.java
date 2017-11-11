package org.yassir.javaweb.services;

import org.yassir.javaweb.entities.RecordCompany;
import org.yassir.javaweb.services.interfaces.RecordCompanyServices;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class RecordCompanyServicesImpl implements RecordCompanyServices, Serializable
{
    @Override
    public int addRecordCompany(RecordCompany recComp) {
        return 0;
    }

    @Override
    public RecordCompany getRecordCompany(RecordCompany recComp) {
        return null;
    }

    @Override
    public RecordCompany getRecordCompany(int id) {
        return null;
    }

    @Override
    public List<RecordCompany> getListRecordCompanys() {
        return null;
    }

    @Override
    public List<RecordCompany> getListRecordCompanys(int maxResults) {
        return null;
    }

    @Override
    public List<RecordCompany> getListRecordCompanys(TypedQuery<RecordCompany> query) {
        return null;
    }

    @Override
    public int updateRecordCompany(RecordCompany recComp) {
        return 0;
    }

    @Override
    public int deleteRecordCompany(RecordCompany recComp) {
        return 0;
    }

    @Override
    public int deleteRecordCompany(int id) {
        return 0;
    }
}
