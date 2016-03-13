package item;

import java.util.ArrayList;

/**
 * Created by dslunjski on 10.3.2016..
 */
public class Items {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    private String title, thumbnailurl;
    private int year;
    private double rating;
    private ArrayList<String> genre;


    public Items(String title, String thumbnailurl, int year, double rating, ArrayList<String> genre) {
        this.title = title;
        this.thumbnailurl = thumbnailurl;
        this.year = year;
        this.rating = rating;
        this.genre = genre;

    }

    public Items()
    {}
}
