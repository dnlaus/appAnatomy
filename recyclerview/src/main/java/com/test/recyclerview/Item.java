package com.test.recyclerview;

/**
 * Created by dnlaus on 13/12/17.
 */

public class Item {

  private String imageUrl;
  private String name;
  private String date;
  private String type;

  public Item(String imageUrl, String name, String date, String type) {
    this.imageUrl = imageUrl;
    this.name = name;
    this.date = date;
    this.type = type;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
