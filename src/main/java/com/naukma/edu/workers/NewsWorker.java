package com.naukma.edu.workers;

import com.naukma.edu.dao.NewsDao;
import com.naukma.edu.enteties.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("newsWorker")
public class NewsWorker {

    @Autowired
    NewsDao newsDao;

    public News addNews(News news) {
        newsDao.addNews(news);
        System.out.println(news);
        return news;
    }
}
