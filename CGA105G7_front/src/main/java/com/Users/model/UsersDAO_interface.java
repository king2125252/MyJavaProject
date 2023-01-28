package com.Users.model;
import java.util.*;
public interface UsersDAO_interface {
	  public void insert(UsersVO userVO);
      public void update(UsersVO userVO);
      public void delete(Integer USER_ID);
      public UsersVO findByPrimaryKey(Integer USER_ID);
      public List<UsersVO> getAll();
     public boolean login(String USER_ACCOUNT,String USER_PASSWORD);
//    public List<UsersVO> getAll(Map<String, String[]> map); 
public byte[] getPic (String USER_PIC) ;
public UsersVO findByUserAccount(String USER_ACCOUNT);
public void updateinfo(UsersVO userVO);
	
}
