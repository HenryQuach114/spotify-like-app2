package com.example;

import com.google.gson.annotations.SerializedName;

public class Song {

  private String name;
  private String artist;
  private String fileName;
  private String genre;
  private int year;
  @SerializedName("IsFavorite") // saved in the json file as "IsFavorite"
  private boolean isFavorite;
  

  // serializes attributes into a string
  public String toString() {
    String s;

    // since the object is complex, we return a JSON formatted string
    s = "{ ";
    s += "name: " + name;
    s += ", ";
    s += "artist: " + artist;
    s += ", ";
    s += "fileName: " + fileName;
    s += " }";

    return s;
  }

  // getters
  public String name() {
    return this.name;
  }

  public String artist() {
    return this.artist;
  }

  public String fileName() {
    return this.fileName;
  }

  public String genre() {
    return this.genre;
  }
  public int year() {
    return this.year;
  }

  public boolean isFavorite() {
    return this.isFavorite;
  }

  // switches the favorite between true and false
  public void toggleFavorite() {
    this.isFavorite = !this.isFavorite;
  }
}
