package com.naukma.edu.enteties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;

    @ManyToMany(mappedBy = "playedByList")
    private List<Cd> listOfSongs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Cd> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(List<Cd> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", listOfSongs=" + listOfSongs +
                '}';
    }
}
