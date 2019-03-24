package com.naukma.edu.dao;

import com.naukma.edu.enteties.Lecture;

public interface LectureDao {
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);
}
