package com.naukma.edu.workers;

import com.naukma.edu.dao.ArtistDao;
import com.naukma.edu.enteties.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtistWorker {

    @Autowired
    private ArtistDao artistDao;

    public Artist addArtist(Artist artist) {
        artistDao.addArtist(artist);
        System.out.println(artist);
        return artist;
    }
}
