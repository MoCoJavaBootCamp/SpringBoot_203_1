package com.example.demo;

import java.util.Random;

public class Song {
    private long id;
    private String name;
    private String artist;
    private String album;
    private String genre;
    private int rating;
    private int year;
    private boolean inStock;

    Song() {
        setInStock();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock() {
        Random random = new Random();
        this.inStock = random.nextBoolean();
    }
}
