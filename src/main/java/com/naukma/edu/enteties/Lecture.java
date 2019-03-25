package com.naukma.edu.enteties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private double credits;
    @Column(name = "birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @OneToOne
    @JoinColumn(name = "addressPK")
    private Address address;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "lecture_id")
    private List<News> newsList;

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

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", newsList=" + newsList +
                '}';
    }
}
