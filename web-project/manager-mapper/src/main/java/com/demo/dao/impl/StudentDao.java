package com.demo.dao.impl;

import org.apache.ibatis.annotations.Param;

import com.demo.model.Student;

public interface StudentDao {
	public void addStudent(Student student);
	public void findUserByNameAndPwd(@Param("student_id")Integer student_id, @Param("password")Integer password);
}
