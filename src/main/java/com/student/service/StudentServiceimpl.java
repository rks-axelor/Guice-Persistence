package com.student.service;

import javax.persistence.EntityManager;

import com.entity.Student;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
@Singleton
public class StudentServiceimpl implements StudentService {
	
	@Inject
	Provider<EntityManager> em;
	
  @Override
  @Transactional
public String addStudent(Student s1) {
	EntityManager emanager = em.get();
	emanager.persist(s1);
	return "data added successfully";
}
}
