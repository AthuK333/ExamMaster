package com.exammaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exammaster.entities.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
	
	@Query("select testId from com.exammaster.entities.Test where title=?1")
	public Long getId(String t);
	
	@Query("select title from com.exammaster.entities.Test where title=?1")
	public String showTitle(String t);
	
	@Query("select description from com.exammaster.entities.Test where title=?1")
	public String showDesc(String d);
	
	@Query("select duration from com.exammaster.entities.Test where title=?1")
	public Integer showDuration(String d);
}
