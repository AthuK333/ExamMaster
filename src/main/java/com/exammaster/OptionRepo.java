package com.exammaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exammaster.entities.Option;

@Repository
public interface OptionRepo extends JpaRepository<Option, Long> {

}
