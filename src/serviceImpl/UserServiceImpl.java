package serviceImpl;

import entity.User;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {
    static List<User>userList=new ArrayList<>();
    static {
        userList.add(new User("John Doe", 123456789, "password123", "john.doe@example.com"));
        userList.add(new User("Jane Smith", 987654321, "securepass", "jane.smith@example.com"));
        userList.add(new User("Alice Brown", 456123789, "alice2024", "alice.brown@example.com"));
        userList.add(new User("Bob Johnson", 789321456, "bobpassword", "bob.johnson@example.com"));
    }
    @Override
    public void add(User common) {
       userList.add(common);
    }

    @Override
    public void delete(int id) {
     userList.remove(id-1);
    }

    @Override
    public List<User> service() {
        return userList;
    }

    @Override
    public void update(User common) {
       List<String>user=new ArrayList<>();
       for (User user1:userList){
           user.add(user1.getFullname());
       }
    }

    @Override
    public List<User> getByFullName(String fullname) {
        return userList.stream().filter(user -> user.getFullname().equals(fullname)).toList();
    }

    @Override
    public List<User> getByPassword(String password) {
        return userList.stream().filter(user -> user.getPassword().equals(password)).toList();
    }

    @Override
    public List<User> getByNumber(int number) {
        return userList.stream().filter(user -> user.getNumber()==number).toList();
    }

    @Override
    public List<User> getByFullnameAndNumber(String fullname, int number) {
        return userList.stream().filter(user -> user.getFullname().equals(fullname)&&user.getNumber()==number).toList();
    }
}
