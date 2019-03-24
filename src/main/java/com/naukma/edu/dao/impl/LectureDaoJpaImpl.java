package com.naukma.edu.dao.impl;

import com.naukma.edu.dao.LectureDao;
import com.naukma.edu.enteties.Lecture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository("lectureDao")
public class LectureDaoJpaImpl implements LectureDao {

    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class, id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
