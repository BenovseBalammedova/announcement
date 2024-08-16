package service;

import entity.User;

import java.util.List;

public interface UserService {
   List<User>getByFullName(String fullname);
   List<User>getByPassword(String password);
   List<User>getByNumber(int number);
   List<User>getByFullnameAndNumber(String fullname,int number);
}
