package com.naukma.edu;

import com.naukma.edu.enteties.Lecture;
import com.naukma.edu.workers.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to spring");
        lecture.setCredits(4);
        LecturesWorker worker = (LecturesWorker) context.getBean("worker");
        worker.addLecture(lecture);
    }
}
