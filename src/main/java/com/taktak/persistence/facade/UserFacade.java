package com.taktak.persistence.facade;

import com.taktak.persistence.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserFacade {

    @PersistenceContext
    private EntityManager em;

    public List<UserEntity> existsByQueryParameters(String uname, String pword) {

        // create the query
        TypedQuery<UserEntity> query = em.createQuery("from UserEntity u where u.username =: uname and u.password =: pword", UserEntity.class);
        query.setParameter("uname", uname);
        query.setParameter("pword", pword);

        return query.getResultList();
    }

    public UserEntity getUserData(String uname) {

        TypedQuery<UserEntity> query = em.createQuery("from UserEntity u where u.username =: uname", UserEntity.class);
        query.setParameter("uname", uname);

        return query.getSingleResult();
    }
}
