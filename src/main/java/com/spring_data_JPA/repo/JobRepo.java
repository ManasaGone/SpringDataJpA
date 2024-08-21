package com.spring_data_JPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_data_JPA.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
	
}