package com.fortfaster.restapi.student;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentUpdateController {
	
	@RequestMapping(method=RequestMethod.POST , value = "/update/student")
	
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {
		return StudentRegistration.getInstance().upDateStudent(stdn);
	}

}
