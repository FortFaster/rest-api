package com.fortfaster.restapi.student;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDeleteController {
	
	@RequestMapping(method=RequestMethod.DELETE , value = "/delete/student/{regd}")
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable String regd) {
		return StudentRegistration.getInstance().deleteStudent(regd);
	}

}
