package entity;

public class Announcement {
  private String  category;
  private  String Subcategory;
  private String city;
  private  String picture;

    public Announcement() {
    }

    public Announcement(String category, String subcategory, String city, String picture) {
        this.category = category;
        Subcategory = subcategory;
        this.city = city;
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return Subcategory;
    }

    public void setSubcategory(String subcategory) {
        Subcategory = subcategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "category='" + category + '\'' +
                ", Subcategory='" + Subcategory + '\'' +
                ", city='" + city + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
