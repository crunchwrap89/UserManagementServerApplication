package dataaccess;

import java.util.List;
import javax.ejb.Local;

import domain.User1;

@Local
public interface UserDataAccess {
	public  void insert(User1 newUser);
	public  List<User1> findAll();
	public  List<User1> findBySurname(String surname);
	public User1 findById(int id) throws UserNotFoundException;
	public void editUser(int id, String name, String surname);
	public void updateUser(int id, String name, String surname) throws UserNotFoundException;
	public void deleteUser(int id) throws UserNotFoundException;

}


