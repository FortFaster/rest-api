package com.fortfaster.restapi.student;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRetrieveController {
	
	@RequestMapping(value = "/student/allstudent")
	 @ResponseBody
	  public List<Student> getAllStudents() {
	  return StudentRegistration.getInstance().getStudentRecords();
	  }

}
