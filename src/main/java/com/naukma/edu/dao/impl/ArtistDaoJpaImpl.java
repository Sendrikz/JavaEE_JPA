package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.ArtistDao;
import com.naukma.edu.enteties.Artist;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository("artistDao")
public class ArtistDaoJpaImpl implements ArtistDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Artist addArtist(Artist artist) {
        em.persist(artist);
        return artist;
    }
}
