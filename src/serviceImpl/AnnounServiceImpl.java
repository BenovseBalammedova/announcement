package serviceImpl;

import entity.Announcement;

import entity.User;
import service.AnnouncementService;
import service.CommonService;

import java.util.ArrayList;
import java.util.List;

public class AnnounServiceImpl implements CommonService<Announcement>, AnnouncementService {
    static List<Announcement>announcementList=new ArrayList<>();
    static {
        announcementList.add(new Announcement("Electronics", "Mobile Phones", "Baku", "phone.jpg"));
        announcementList.add(new Announcement("Vehicles", "Cars", "Ganja", "car.jpg"));
        announcementList.add(new Announcement("Real Estate", "Apartments", "Sumqayit", "apartment.jpg"));
        announcementList.add(new Announcement("Home Appliances", "Refrigerators", "Shamakhi", "fridge.jpg"));
    }
    @Override
    public List<Announcement> getByCategory(String category) {
        return announcementList.stream().filter(annou->annou.getCategory().equals(category)).toList();
    }

    @Override
    public List<Announcement> getByCity(String city) {
        return announcementList.stream().filter(annou->annou.getCity().equals(city)).toList();
    }

    @Override
    public List<Announcement> getBySubCategoryAndCity(String subcategory, String city) {
        return announcementList.stream().filter(anoun->anoun.getSubcategory().equals(subcategory)&&anoun.getCity().equals(city)).toList();
    }

    @Override
    public void add(Announcement common) {
        announcementList.add(common);
    }

    @Override
    public void delete(int id) {
      announcementList.remove(id);
    }

    @Override
    public List<Announcement> service() {
        return announcementList;
    }

    @Override
    public void update(Announcement common) {
           List<String>announ=new ArrayList<>();
           for (Announcement user:announcementList){
               announ.add(user.getCity());
           }
    }
}
