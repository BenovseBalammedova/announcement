package service;

import entity.Announcement;

import java.util.List;

public interface AnnouncementService {
    List<Announcement>getByCategory(String category);
    List<Announcement>getByCity(String city);
    List<Announcement>getBySubCategoryAndCity(String subcategory,String city);

}
