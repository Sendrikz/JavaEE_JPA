package com.naukma.edu.enteties;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NewsId implements Serializable {
    private String title;
    private String language;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsId newsId = (NewsId) o;
        return Objects.equals(title, newsId.title) &&
                Objects.equals(language, newsId.language);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, language);
    }

    @Override
    public String toString() {
        return "NewsId{" +
                "title='" + title + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
