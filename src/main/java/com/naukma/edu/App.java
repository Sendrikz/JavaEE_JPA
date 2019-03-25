package com.naukma.edu;

import com.naukma.edu.enteties.*;
import com.naukma.edu.workers.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Address address = new Address();
        address.setCity("Kiev");
        address.setState("Darnitskie rayon");
        address.setCountry("Ukraine");
        address.setStreet("Urlovskaya");
        address.setZipcode("123aa");

        Lecture lecture = new Lecture();
        lecture.setName("Introduction to spring");
        lecture.setCredits(4);
        lecture.setAddress(address);
        LecturesWorker worker = (LecturesWorker) context.getBean("worker");
        worker.addLecture(lecture);

        AddressWorker addressWorker = (AddressWorker) context.getBean("addressWorker");
        addressWorker.addAddress(address);

        NewsId newsId = new NewsId();
        newsId.setLanguage("Ukrainian");
        newsId.setTitle("Important");
        News news = new News();
        news.setId(newsId);
        news.setContent("Today is Java Day");
        NewsWorker newsWorker = (NewsWorker) context.getBean("newsWorker");
        newsWorker.addNews(news);

        System.out.println(worker.getLecture(9));


        Cd cd1 = new Cd();
        cd1.setTitle("Spring");
        Cd cd2 = new Cd();
        cd2.setTitle("Winter");
        List<Cd> cdList = new ArrayList<>();
        cdList.add(cd1);
        cdList.add(cd2);
        CdWorker cdWorker = context.getBean("cdWorker", CdWorker.class);
        cdWorker.addCd(cd1);
        cdWorker.addCd(cd2);

        Artist artist = new Artist();
        artist.setName("Nairy");
        artist.setSurname("Belandros");
        artist.setListOfSongs(cdList);
        ArtistWorker artistWorker = context.getBean("artistWorker", ArtistWorker.class);
        artistWorker.addArtist(artist);
    }
}
