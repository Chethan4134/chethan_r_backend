package com.excel.hibernate_spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.excel.hibernate_spring.modules.Student;

@Component
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}
	//get all data
		@Transactional
		public List<Student> getAllData() {
			
			List<Student> studentDetails = hibernateTemplate.loadAll(Student.class);
			return studentDetails;
		}
		
		//delete
		@Transactional
		public  void delete(Student student) {
			Student studentId = hibernateTemplate.get(Student.class, student.getId());
			System.err.println(studentId);
			hibernateTemplate.delete(student);
			
		}
		
		//update
		@Transactional
		public void update(Student student) {
			
			hibernateTemplate.update(student);
		}
}
