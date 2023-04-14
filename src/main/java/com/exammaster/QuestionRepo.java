package com.exammaster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exammaster.entities.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {

	
	@Query("select questionId from com.exammaster.entities.Question where questionText=?1")
	public Long getId(String t);
	
	
	@Query("from com.exammaster.entities.Question where testId=?1 ")
	public List<Question> li(Long id);
}
