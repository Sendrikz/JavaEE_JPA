package com.naukma.edu.workers;

import com.naukma.edu.dao.LectureDao;
import com.naukma.edu.enteties.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("worker")
public class LecturesWorker {

    @Autowired
    LectureDao lectureDao;

    public Lecture addLecture(Lecture lecture) {
        lecture = lectureDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return lectureDao.getLecture(id);
    }

}
