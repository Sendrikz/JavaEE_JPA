package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.CdDao;
import com.naukma.edu.enteties.Cd;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository("cdDao")
public class CdDaoJpaImpl implements CdDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Cd addCd(Cd cd) {
        em.persist(cd);
        return cd;
    }
}
