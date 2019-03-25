package com.naukma.edu.enteties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    @ManyToMany
    @JoinTable(name = "artist_cd",
            joinColumns = @JoinColumn(name = "artist_fk"),
            inverseJoinColumns = @JoinColumn(name = "cd_fk"))
    private List<Artist> playedByList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Artist> getPlayedByList() {
        return playedByList;
    }

    public void setPlayedByList(List<Artist> playedByList) {
        this.playedByList = playedByList;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", playedByList=" + playedByList +
                '}';
    }
}
