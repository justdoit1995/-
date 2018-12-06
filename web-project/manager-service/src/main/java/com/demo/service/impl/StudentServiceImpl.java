package com.demo.service.impl;

import com.demo.dao.impl.StudentDao;
import com.demo.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void login(Integer student_id, Integer password) {
		// TODO Auto-generated method stub
		studentDao.findUserByNameAndPwd(student_id, password);
	}

}
