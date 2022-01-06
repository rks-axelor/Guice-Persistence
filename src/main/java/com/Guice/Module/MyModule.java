package com.Guice.Module;

import com.entity.Controller;
import com.google.inject.AbstractModule;
import com.student.service.StudentService;
import com.student.service.StudentServiceimpl;

public class MyModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(StudentService.class).to(StudentServiceimpl.class);
		bind(Controller.class);
		super.configure();
	}

}
