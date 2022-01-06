package com.entity;

import javax.ws.rs.GET;

import javax.ws.rs.Path;

import com.google.inject.Inject;
import com.student.service.StudentService;

@Path("/")
public class Controller {
     @Inject
	StudentService ss;
    @GET
	@Path("add")
	public void AddStudent() {
		Student s1 = new Student();
		s1.setSname("ravi");
		s1.setScity("pune");
		s1.setSid(101);
		String e= ss.addStudent(s1);
		System.out.println(e);
	}
}
