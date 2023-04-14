package com.exammaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exammaster.entities.User;

@Repository
public interface LoginRepo extends JpaRepository<User, Integer> {
	
	
	@Query("select u from com.exammaster.entities.User u where u.username=?1 and u.password=?2")
	public User validLogin(String uname,String pass);

}
