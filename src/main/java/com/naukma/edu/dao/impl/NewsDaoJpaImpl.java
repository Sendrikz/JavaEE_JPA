package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.NewsDao;
import com.naukma.edu.enteties.News;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository("newsDao")
public class NewsDaoJpaImpl implements NewsDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public News addNews(News news) {
        em.persist(news);
        return news;
    }
}
